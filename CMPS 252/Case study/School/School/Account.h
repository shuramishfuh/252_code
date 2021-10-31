#pragma once
#include<string>
#include<list>
class Transaction;
class Account
{
private:
	std::string _accountNumber;
	std::list<Transaction*>* _transactions;
	double _balance;
	Account();
protected:
	static int lastAccountNumber;
	void increaseBalance(double amount);
	void decreaseBalance(double amount);
	void addTransaction(Transaction* transaction);
public:
	virtual std::string getAccountType()=0;
	Account(double initialBalance);
	
	void Deposit(double amount);
	std::list<Transaction*>* getTransactions();
	friend std::ostream& operator<<(std::ostream& os, Account& t);
	double getBalance();
	long getTransactionCount();
	void transferTo(Account* toAccount, double amount);
	void print();
};