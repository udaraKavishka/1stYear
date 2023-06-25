/*
    Date: 17.10.2022
    Practical Number: 11
    Problem Specification: Write a program to identify the computing order of basic arithmetic operator
*/

#include <iostream>
using namespace std;

int main(){

    int expression1 = 3+4/2-2;
    int expression2 = 5-2*5+3;
    int expression3 = (5-2)*5+3;
    int expression4 = (11+4)/3+(7-3)*4;

    cout<<expression1<<endl;
    cout<<expression2<<endl;
    cout<<expression3<<endl;
    cout<<expression4<<endl;

    return 0;
}
