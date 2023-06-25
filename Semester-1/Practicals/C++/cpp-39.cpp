/*
    Date: 18.11.2022
    Practical number: 39
    Problem specification: Find the greatest common divisor (GCD) of given two numbers
*/

#include <iostream>
using namespace std;
int main(){

    int i = 1, num1, num2, gcd;

    cout<<"Enter the number 1: ";
        cin>>num1;

    cout<<"Enter the number 2: ";
        cin>>num2;

    while(i <= num1 && i <= num2)
    {
        if(num1 % i == 0 && num2 % i == 0)
        {
            gcd = i;
        }
        i++;
    }
    cout<<"Greatest Common Divisor: "<<gcd;

    return 0;
}
