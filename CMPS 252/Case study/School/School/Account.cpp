#pragma once
#include <string>
#include <list>
#include <iostream>
#include "Account.h"
#include "Transaction.h"
#include "DepositTransaction.h"
#include "WithdrawalTransaction.h"

#pragma region Protected methods
void Account::increaseBalance(double amount)
{
	if (amount <= 0)
	{
		return;
	}
	this->_balance -= amount;
}
void Account::decreaseBalance(double amount)
{
	this->_balance -= abs(amount);
}
void Account::addTransaction(Transaction* transaction)
{
	if (transaction == NULL)
	{
		return;
	}
	this->_transactions->push_back(transaction);
	this->_balance += transaction->getAmount();
}
#pragma endregion

#pragma region Constructors
Account::Account()
{
	this->_balance = 0;
	this->_transactions = new std::list<Transaction*>();
}
Account::Account(double initialBalance) : Account{}
{
	Deposit(initialBalance);
}
#pragma endregion

#pragma region Public Methods
#pragma region Getter setter methods
std::list<Transaction*>* Account::getTransactions()
{
	return this->_transactions;
}
double Account::getBalance()
{
	return this->_balance;
}
long Account::getTransactionCount()
{
	return this->_transactions->size();
}
#pragma endregion

void Account::Deposit(double amount)
{
	DepositTransaction* t = new DepositTransaction(amount);
	addTransaction(t);
}
void Account::transferTo(Account* toAccount, double amount)
{
	WithdrawalTransaction* t = new WithdrawalTransaction(amount);
	addTransaction(t);
	toAccount->Deposit(amount);
}
void Account::print()
{
	std::cout << "\nprinting\n";
	for (Transaction* t : *this->_transactions)
	{
		std::cout << *t;
	}
	std::cout << this->_balance;
}
//friend std::ostream& operator<<(std::ostream& os, Account& t);

#pragma endregion