#pragma once
#include "Account.h"
class SavingsAccount : public Account
{
public:
	SavingsAccount(double initialBalance);
	virtual std::string getAccountType() override;
};