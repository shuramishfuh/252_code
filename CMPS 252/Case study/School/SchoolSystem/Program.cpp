#include <iostream>
#include "../School/Person.h"
#include "../School/Roster.h"

int main()
{
    std::cout << "School System\n";
    Person p1 = { "Joe" };
    Person p2 = { "Jane" };
    Roster r;
    r.add(p1);
    r.add(p2);
    r.print();
}