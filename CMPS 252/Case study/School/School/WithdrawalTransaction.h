#pragma once
#include "Transaction.h"
class WithdrawalTransaction : public Transaction
{
public:
	WithdrawalTransaction(double amount);
	virtual std::string getTransactionType() override;
};