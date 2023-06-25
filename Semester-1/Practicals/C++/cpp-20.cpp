/*
    Date: 28.10.2022
    Practical Number: 20
    Problem Specification: Write a c++ program to find the user input value is odd or even
*/

#include <iostream>
using namespace std;

int main(){

    int a,b;
    cout<<"Enter number: ";
        cin>>a;

    b=a%2;
    if(b==1)
    {
        cout<<"odd number";
    }
    else
    {
        cout<<"Even number";
    }

    return 0;
}
