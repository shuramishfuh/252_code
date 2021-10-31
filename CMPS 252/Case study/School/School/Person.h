#pragma once
#include<string>
#include<iostream>
class Person
{
private:
	std::string _firstName;
public:
	Person(std::string const& firstName);
	std::string getFirstName() const;
	void setFirstName(std::string const f);
	void p();
};
