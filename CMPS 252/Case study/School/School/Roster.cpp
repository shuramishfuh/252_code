#include "Roster.h"
#include <iostream>
using namespace std;
void Roster::add(Person p) 
{
	people.push_back(p); 
}
void Roster::print()
{
	for (Person p : people)
	{
		cout << p.getFirstName() << endl;
	}
};