/*
    Date: 12.12.2022
    Practical number: 53
    Problem specification: Write a program in c++ to find the series 1 + 1/2^2 + 1/3^3 + ... + 1/n^n
*/

#include <iostream>
#include <cmath>
using namespace std;
int main(){

    double sum=0, x;
    int num, i;
    cout<<"Input a number: ";
        cin>>num;

    for(int i=1; i<=num; ++i){

        x=1/ pow(i,i);
        cout<<"1/"<<i<<"^"<<i<<"="<<x<<endl;
        sum += x;
    }
    cout<<"Sum of the series is: "<<sum<<endl;

    return 0;
}
