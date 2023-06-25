/*
    Date: 28.10.2022
    Practical Number: 17
    Problem Specification: Write a c++ code to understand the assignment operators
*/

#include <iostream>
using namespace std;

int main(){

    int a=10, b=20;
    //assignment operators
    cout<<"(a=b): "<<(a=b)<<endl;
    cout<<"(a+=b): "<<(a+=b)<<endl;
    cout<<"(a-=b): "<<(a-=b)<<endl;
    cout<<"(a*=b): "<<(a*=b)<<endl;
    cout<<"(a/=b): "<<(a/=b)<<endl;
    cout<<"(a%=b): "<<(a%=b)<<endl;

    return 0;
}
