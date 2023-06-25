/*
    Date: 28.10.2022
    Practical Number: 22
    Problem Specification: Get three marks from user and print the massage about pass or fail based on the avarage
*/

#include <iostream>
using namespace std;

int main(){

    int x,y,z,avg;
    cout<<"Enter the marks x,y,z: "<<endl;
        cin>>x>>y>>z;

    avg = (x+y+z)/3;
    if(x>40)
    {
        cout<<"Pass";
    }
    else
    {
        cout<<"Fail";
    }

    return 0;
}
