/*
    Date: 21.10.2022
    Practical Number: 13
    Problem Specification: Write a c++ code to find the solution for following equation,
                                   √[(x1-x2)^2+(y1+y2)^2]
*/

#include <iostream>
#include <cmath>
using namespace std;

int main(){

    double x1,x2,y1,y2;
    cout<<"Enter a value for x1: "<<endl;
        cin>>x1;
    cout<<"Enter a value for x2: "<<endl;
        cin>>x2;
    cout<<"Enter a value for y1: "<<endl;
        cin>>y1;
    cout<<"Enter a value for y2: "<<endl;
        cin>>y2;

    double equ = sqrt(pow((x1-x2),2) + pow((y1-y2),2));
        cout<<equ<<endl;

    return 0;
}
