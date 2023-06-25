/*
    Date: 11.11.2022
    Practical number: 31
    Problem specification: Find the summation of odd numbers from 0 to 999
*/

#include <iostream>
using namespace std;
int main(){

    int i, sum = 0;
    for(i=1;i<1000;i+=2)
    {
        sum += i;
    }
    cout<<"sum is: "<<sum<<endl;

    return 0;
}
