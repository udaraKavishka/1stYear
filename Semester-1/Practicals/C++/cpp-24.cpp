/*
    Date: 04.11.2022
    Practical number: 24
    Problem specification: Write a c++ program to find the largest number among user inputs
*/

#include <iostream>
using namespace std;
int main(){

    double x,y,z;
        cout<<"Enter three numbers: "<<endl;
            cin>>x>>y>>z;

    if ((y<x) && (x>z))
    {
        cout<<x<<" is the largest number"<<endl;
    }
    else if ((x<y) && (y>z))
    {
        cout<<y<<" is the largest number"<<endl;
    }
    else
    {
        cout<<z<<" is the largest number"<<endl;
    }


    return 0;
}
