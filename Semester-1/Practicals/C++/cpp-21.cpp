/*
    Date: 28.10.2022
    Practical Number: 21
    Problem Specification: Write a c++ code to find the user input value is positive or negative
*/

#include <iostream>
using namespace std;

int main(){

    int x;
    cout<<"Enter number: "<<endl;
        cin>>x;

    if(x>0)
    {
        cout<<"Positive number";
    }
    else
    {
        cout<<"Negative number";
    }

    return 0;
}
