#pragma once
#include "Transaction.h"
class DepositTransaction : public Transaction
{
public:
	DepositTransaction(double amount);
	virtual std::string getTransactionType() override;
};