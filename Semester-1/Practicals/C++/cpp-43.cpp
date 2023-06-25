/*
    Date: 21.11.2022
    Practical number: 43
    Problem specification: Find the Summation of positive numbers
*/

#include <iostream>
using namespace std;
int main(){


    /*

    int a,b,t=0;

    cout << "Enter a Positive Number: " << endl;
        cin >> a;
    cout << "Enter a Positive Number: " << endl;
        cin >> b;

    while(a&&b >0){
        t=a+b;
    }
    cout << "Summation is " << t << endl;

    */

    int num=0, sum=0;

    while(num>=0)
    {
        sum+=num;
    }
        cout << "Enter a Number: ";
        cin >> num;

    /*

    do
    {
        sum+=num;
        cout << "Enter a Number: " << endl;
        cin >> num;
    }
    while(num>=0)
        cout << "\nThe sum is " << sum << endl;

    */

    return 0;
}
