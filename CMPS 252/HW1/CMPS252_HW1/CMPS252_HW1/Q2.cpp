#include <iostream>

int main()
{
    int x = 78;
    int y = 12;
    int* p = &x;
    int* q = &y;
    p = q;
    *p = 90;
    std::cout << x << " " << y << std::endl;
    std::cout << *p << " " << *q << std::endl;



    /* the out put will be of order 78 90 and 90 90. The variable x does not change in
    content and though initially the value of the pointer pointed to x it was later reasigned to
    point to y hence the result.


    Note: though the standard header was included, specificity on the class was still needed
*/

}
