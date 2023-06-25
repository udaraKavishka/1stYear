/*
    Date: 17.10.2022
    Practical Number: 08
    Problem Specification: Write a program to take registration number, full name, address, age & sex as user inputs & display them to the user
*/

#include <iostream>
using namespace std;
int main(){

    string fName,regNum,address;
    int age;
    char sex;

    cout<<"Enter your full name: "<<endl;
    getline(cin,fName);
    cout<<"Enter your registration number: "<<endl;
    getline(cin,regNum);
    cout<<"Enter your address: "<<endl;
    getline(cin,address);
    cout<<"Enter your age: "<<endl;
    cin>>age;
    cout<<"Enter your sex: "<<endl;
    cin>>sex;


    return 0;
}
