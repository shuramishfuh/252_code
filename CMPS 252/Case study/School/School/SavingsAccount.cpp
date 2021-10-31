#pragma once
#include "SavingsAccount.h"

SavingsAccount::SavingsAccount(double initialBalance) : Account{ initialBalance }
{
	
}

std::string SavingsAccount::getAccountType()
{
	return "SavingsAccount";
}