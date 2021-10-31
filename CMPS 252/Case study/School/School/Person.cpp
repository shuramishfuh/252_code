#include "Person.h"
#include<string>
using namespace std;
#pragma region Constructors
Person::Person(string const& firstName)
{
	_firstName = firstName;
}
#pragma endregion

#pragma region Getters and Setters
string Person::getFirstName() const { return this->_firstName; }
void Person::setFirstName(string const f) { this->_firstName=f; }
#pragma endregion