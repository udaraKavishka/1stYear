/*
    Date: 21.10.2022
    Practical Number: 12
    Problem Specification: Write a c++ code for find the value of the following equation,
                                    sum = (a+b)*(a+c)/(b-c)
                            get the value for a,b,c from user
*/

#include <iostream>
using namespace std;

int main(){

    double a,b,c;
    cout<<"Enter value for a: "<<endl;
        cin>>a;
    cout<<"Enter value for b: "<<endl;
        cin>>b;
    cout<<"Enter value for c: "<<endl;
        cin>>c;

    double sum = (a+b)*(a+c)/(b-c);
        cout<<"sum="<<sum<<endl;

    return 0;
}
