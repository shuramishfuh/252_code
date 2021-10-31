#pragma once
#include "Person.h"
#include <vector>
using namespace std;
class Roster
{
private:
	vector<Person> people;
public:
	void add(Person p);
	void print();
};