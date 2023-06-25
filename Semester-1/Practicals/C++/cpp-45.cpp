/*
    Date: 21.11.2022
    Practical number: 45
    Problem specification: Ask the user to enter a number and find the sum of numbers from 1 to the num,
                            1+2+3+4+5+6........+n;
*/

#include <iostream>
using namespace std;
int main(){

    int num, sum=0;

    cout << "Enter an Integer number: " << endl;
        cin >> num;

    cout << "Summation from 1 to " << num << endl;

    while(num>=1)
    {
        sum=sum+num;
        --num;
    }

    do
    {
        sum=sum+num;
    }
    while(num>=1);

    return 0;
}
