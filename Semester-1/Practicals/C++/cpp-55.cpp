/*
    Date: 12.12.2022
    Practical number: 55
    Problem specification: Write a program in c++ to display the multiplication table vertically from 1 to n.
*/

#include <iostream>
using namespace std;
int main(){

    int a, b, num;

    cout<<"Input the number: ";
        cin>>num;

    cout<<"Multiplication table of 16 from 1 to "<<num<<endl;

    for(int a=1; a<=num; a++){
        if(a <= num-1)
            cout<<a<<"*"<<b<<"= "<<b * a<<" ";
        else
            cout<<a<<"*"<<b<<"= "<<a * b<<" ";
    }
    cout<<endl;

    return 0;
}
