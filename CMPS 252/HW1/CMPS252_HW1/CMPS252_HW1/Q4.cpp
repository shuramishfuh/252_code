#include <iostream>

int main()
{
	int nums[]{ 10,20,30,40,50,60,70,80,90 };
	std::cout << nums << std::endl; //record the value you get: 010FFB28
	//explain why you got such a value: nums points to a memory address of type in that houses
	// the elements of the array( it doesn't point to any value)


	std::cout << *nums << std::endl;//record the value you get: 10
	//explain why you got such a value: a pointer to an array(without using size of the array
	//e.g int (*ptr)[5]) points to the first element of the array
	    
	std::cout << *nums + 1 << std::endl;//record the value you get: 11
	//explain why you got such a value: since a pointer to an array point to the first element,
	// this statement gets the first value(10) and adds 1 to it

	std::cout << *(nums + 1) << std::endl;//record the value you get: 20
	//explain why you got such a value: the pointer points to the next element after the first
	// like indexing

	int i = std::size(nums)-1; //assign a new value to i so that the following statement prints the last element of the array
	std::cout << *(nums + i) <<std::endl;
	
	

}
