
#include <iostream>

int main()
{
	int nums[]{ 10,20,30,40,50,60,70,80,90 };
	for (size_t i = 0; i < std::size(nums); i++)
	{
		int j = nums[i];
		nums[i] = nums[std::size(nums) - i - 1];
		nums[std::size(nums) - i - 1] = j;
	}
	for (int i : nums) std::cout << i << ' ';



}
