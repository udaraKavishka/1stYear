/*
    Date                    : 30.12.2022
    Practical number        : 67
    Problem specification   : Write a c++ program to check whether the given number is in the array.
*/

#include <iostream>
using namespace std;
int main(){

    int arr[10] = {2, 8, 16, 7, 85, 3, 5, 1, 9, 10};

    int num;

    bool r = 0;
    cout<<"Enter No: ";
        cin>>num;

    for(int i=0; i>=0; i++){
        if(num == arr[i]){
            cout<<num<<" is in the array.";
            r = 1;
        break;
        }
        if(r == 0){
            cout<<num<<" is not in the array.";
        break;
        }
    }

    return 0;
}
