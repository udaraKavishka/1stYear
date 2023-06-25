/*
    Date: 19.12.2022
    Practical number: 61
    Problem specification: Array in C++ using while loop.
*/

#include <iostream>
using namespace std;
int main(){

    int x = 0;
    int arr[10];

    while(x<10){

        arr[x] = x+1;
        cout<<"arr["<<x<<"] : "<<arr[x]<<endl;
        x++;
    }

    return 0;
}
