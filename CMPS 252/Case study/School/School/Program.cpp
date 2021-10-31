#include <iostream>
#include <string>
#include "DepositTransaction.h"
#include "SavingsAccount.h"

using namespace std;
int main()
{
	SavingsAccount* a = new SavingsAccount{ 100 };
	SavingsAccount* b = new SavingsAccount{ 200 };
	
	a->Deposit(20);
	a->transferTo(b, 35);
	a->print();
	b->print();
}