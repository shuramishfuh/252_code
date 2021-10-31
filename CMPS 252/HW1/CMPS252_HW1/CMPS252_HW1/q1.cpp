#include <iostream>
#include <bitset>
int main()
{

    std::cout << "dec " << " hex " << "oct " << " binary " << "Ascii" << std::endl;
    for (int i = 65; i <= 90; i++) {
        const int a = i;
        std::cout << std::dec << i << ' '
            << std::hex << "0*" << i << ' '
            << std::oct << i << ' '
            << std::bitset<8>{static_cast<unsigned long long>(a)} << ' '
            << (char)i << std::endl;
    }


}