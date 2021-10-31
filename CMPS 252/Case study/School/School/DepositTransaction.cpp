#pragma once
#include "DepositTransaction.h"
#include <string>
DepositTransaction::DepositTransaction(double amount) : Transaction(amount)
{

}

std::string DepositTransaction::getTransactionType()
{
    return "Deposit";
}