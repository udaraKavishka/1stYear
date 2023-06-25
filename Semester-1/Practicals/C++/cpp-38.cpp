/*
    Date: 18.11.2022
    Practical number: 38
    Problem specification: Print the multiplication table of number 29
*/

#include <iostream>
using namespace std;
int main()
{
	int val = 29, num = 1, mul;

	while(num<=12)
    {
        mul = num * val;
        cout<<val<<" * "<<num<<" = "<<mul<<endl;
        num++;
    }

	return 0;
}
