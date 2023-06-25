/*
    Date: 17.10.2022
    Practical Number: 10
    Problem Specification: Write a program to do multiplication and division
*/

#include <iostream>
using namespace std;
int main(){

    int num1=24, num2=45;
    int mul=num1*num2;
    double div=(double)num1/(double)num2;
    cout<<num1<<"*"<<num2<<"="<<mul<<endl;
    cout<<num1<<"/"<<num2<<"="<<div<<endl;

    return 0;
}
