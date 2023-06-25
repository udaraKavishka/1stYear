/*
    Date: 28.10.2022
    Practical Number: 18
    Problem Specification: Write a c++ code to understand the logical operators
*/

#include <iostream>
using namespace std;

int main(){

    int a=10, b=20, c=5;
    bool result;

    //logical operators
    result = (a<b) && (b>c);
        cout<<"(a<b) && (b>c): "<<result<<endl;

    result = (a<b) || (b==c);
        cout<<"(a<b) || (b==c): "<<result<<endl;

    result = !(a<b);
        cout<<"!(a<b): "<<result<<endl;

    result = (a>b) && (b>c);
        cout<<"(a>b) && (b>c): "<<result<<endl;

    result = !(a>b);
        cout<<"!(a>b): "<<result<<endl;

    return 0;
}
