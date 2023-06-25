 /*
    Date: 18.11.2022
    Practical number: 36
    Problem specification: Find the factorial value of a given number using while loop
*/

#include <iostream>
using namespace std;
int main()
{
    int num, f = 1;

    cout<<"Enter the number: "<<endl;
        cin>>num;

    while(num>1)
    {
        f *= num;
        num --;
    }
    cout<<"Factorial: "<<f<<endl;

    return 0;
}
