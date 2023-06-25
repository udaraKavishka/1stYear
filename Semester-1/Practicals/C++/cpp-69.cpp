/*
    Date                    : 03.01.2023
    Practical number        : 69
    Problem specification   : Write a c++ program to do the right rotation of the below array.
                                34, 56, 78, 90, 23  ==> 23, 34, 56, 78, 90
*/

#include <iostream>
using namespace std;
int main(){

    int arr[5] = {34, 56, 78, 90, 23};

    int x = sizeof(arr) / sizeof(int);
    for(int i=0; i<x; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    for(int i=0; i<x; i++){
        if(i == 0){
            cout<<arr[x-1]<<" ";
        }
        else{
            cout<<arr[i-1]<<" ";
        }
    }

    return 0;
}
