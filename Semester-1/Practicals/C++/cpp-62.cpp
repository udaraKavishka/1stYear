/*
    Date: 19.12.2022
    Practical number: 62
    Problem specification: School exam results array in C++.
*/

#include <iostream>
using namespace std;
int main(){

    float sum = 0, avg = 0;
    int arr[10];

    arr[0] = 93;
    arr[1] = 82;
    arr[2] = 73;
    arr[3] = 64;
    arr[4] = 55;
    arr[5] = 41;
    arr[6] = 53;
    arr[7] = 66;
    arr[8] = 69;
    arr[9] = 75;

    for(int a=0; a<10; a++){
        sum = sum + arr[a];
    }
    cout<<"Sum: "<<sum<<endl;

    avg = sum/10;

    cout<<"Average is: "<<avg<<endl;

    return 0;
}
