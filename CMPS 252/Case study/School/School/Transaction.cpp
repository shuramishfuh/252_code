#pragma once
#include <chrono>
#include <string>
#include <iostream>
#include <iomanip> //setw, setfill, set precision
#include <sstream>
#include "Transaction.h"

long Transaction::_lastTransactionNumber; //Static data members declarations in the class declaration are not definition of them. To define them you should do this in the .CPP file to avoid duplicated symbols.

#pragma region Constructors
Transaction::Transaction(double amount, Account* sourceAccount) : Transaction(amount)
{
	this->_sourceAccount = sourceAccount;
}
Transaction::Transaction(double amount) : Transaction()
{
	this->_amount = amount;
}
Transaction::Transaction()
{
	this->_amount = 0;
	this->_sourceAccount = NULL;
	this->_transactionDate = time(NULL);
	char tran[6] = {};
	std::stringstream s;
	s << std::setw(6) << std::setfill('0') << ++_lastTransactionNumber;
	s >> _transactionNumber;
}
#pragma endregion

#pragma region Getter Methods
	tm Transaction::getTransactionDate()
	{
		tm now_tm = {};
		localtime_s(&now_tm, &this->_transactionDate);
		return now_tm;
	}
	std::string Transaction::getTransactionDateString()
	{
		char str[26] = {};
		auto v = getTransactionDate();
		asctime_s(str, 26, &v);
		return str;
	}
	double Transaction::getAmount()
	{
		return this->_amount;
	}
	Account* Transaction::getSourceAccount()
	{
		return this->_sourceAccount;
	}
	std::string Transaction::getTransactionNumber()
	{
		return this->_transactionNumber;
	}
#pragma endregion

#pragma region Operator Overloads
	Transaction::operator std::string()
	{
		return getTransactionDateString() + '|' + getTransactionNumber() + '|' + getTransactionType() + '|' + std::to_string(_amount);
	}
	std::ostream& operator<<(std::ostream& os, Transaction& t)
	{
		os << '#' << std::setw(6) << std::setfill('0') << t._transactionNumber << std::setfill('_') << " " << std::setw(10) << std::left << t.getTransactionType() << " $" << std::setw(10) << std::right << std::fixed << std::setprecision(2) << t._amount << std::endl;
		return os;
	}
#pragma endregion