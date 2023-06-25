/*
    Date: 11.11.2022
    Practical number: 32
    Problem specification: Write c++ code to find the factorial of a given number
                            3!=1*2*3
*/

#include <iostream>
#include <cmath>
using namespace std;
int main(){

    int i, f=1, n=3;
    for(i=1;i<=n;i++)
    {
        f=f*i;
    }
    cout<<"Factorial of "<<n<<"! is: "<<f<<endl;

    return 0;
}
