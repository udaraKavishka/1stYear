/*
    Date: 19.12.2022
    Practical number: 59
    Problem specification: Array in C++.
*/

#include <iostream>
using namespace std;
int main(){

    int arr[5]; //Declaration
    int arr1[5] = {1,2,3,4,5}; //Array initialization

    //Accessing array elements
    cout<<"arr1[0] : "<<arr1[0]<<endl;
    cout<<"arr1[1] : "<<arr1[1]<<endl;
    cout<<"arr1[2] : "<<arr1[2]<<endl;
    cout<<"arr1[3] : "<<arr1[3]<<endl;
    cout<<"arr1[4] : "<<arr1[4]<<endl;

    cout<<"\n\nAccessing array elements using for loop"<<endl;
    for(int i=0; i<5; i++)
        cout<<"arr1["<<i<<"] : "<<arr1[i]<<endl;
    cout<<"\n\nInterest the values into the array"<<endl;

    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;

    for(int i=0; i<5; i++){
        arr[i] = i+1;
        cout<<"arr["<<i<<"] : "<<arr[i]<<endl;
    }

    return 0;
}
