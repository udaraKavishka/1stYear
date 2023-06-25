/*
    Date: 19.12.2022
    Practical number: 60
    Problem specification: Array in C++ using for loop.
*/

#include <iostream>
using namespace std;
int main(){

    int arr[10];

    for(int i=0; i<10; i++){
        arr[i] = i+1;
        cout<<"arr["<<i<<"] : "<<arr[i]<<endl;
    }

    return 0;
}
