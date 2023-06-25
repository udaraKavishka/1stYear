/*
    Date: 28.10.2022
    Practical Number: 14
    Problem Specification: Write a c++ program to understand the function of increment & decrement operators
*/

#include <iostream>
using namespace std;

int main(){

    int a = 7;
    //Increment operator
    cout<<"a="<<a<<endl;
    cout<<"++a="<<++a<<endl;

    //post increment operator
    cout<<"a++="<<a++<<endl;
    cout<<a<<endl;

    //pre increment operator
    cout<<"++a="<<++a<<endl;

    return 0;
}
