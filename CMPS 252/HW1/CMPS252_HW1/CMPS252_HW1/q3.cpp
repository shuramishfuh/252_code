#include <iostream>

int main()
{
	int i = 5;
	int* r = &i;
	int** s = &r;
	std::cout << "the value of s is  " << **s << std::endl;  // prints 5

	int*** t = &s;
	std::cout << "the value of t is  " << ***t << std::endl; // prints 5

}