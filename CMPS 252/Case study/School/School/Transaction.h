#pragma once
#include <chrono>
#include <string>
#include "Account.h"
const class Transaction
{
private:
	time_t _transactionDate;
	double _amount;
	Account* _sourceAccount;
	std::string _transactionNumber;
	static long _lastTransactionNumber; //Static data members declarations in the class declaration are not definition of them. To define them you should do this in the .CPP file to avoid duplicated symbols.
	Transaction();
public:
#pragma region Constructors
	Transaction(double amount, Account* sourceAccount);
	Transaction(double amount);
#pragma endregion

#pragma region Getter Methods
	tm getTransactionDate();
	std::string getTransactionDateString();
	double getAmount();
	Account* getSourceAccount();
	std::string getTransactionNumber();
#pragma endregion

#pragma region Operator Overloads
	operator std::string();
	friend std::ostream& operator<<(std::ostream& os, Transaction& point);
	double operator+(const Transaction& rhs)
	{
		return this->_amount + rhs._amount;
	}
#pragma endregion

#pragma region Pure Virtual Methods
	virtual std::string getTransactionType() = 0;
#pragma endregion
};

