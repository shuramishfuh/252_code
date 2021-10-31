#pragma once
#include "WithdrawalTransaction.h"
#include <string>
WithdrawalTransaction::WithdrawalTransaction(double amount) : Transaction(-1*abs(amount))
{

}

std::string WithdrawalTransaction::getTransactionType()
{
    return "Withdrawal";
}