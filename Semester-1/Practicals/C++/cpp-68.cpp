/*
    Date                    : 02.01.2022
    Practical number        : 68
    Problem specification   : Write a c++ program to do left rotation of an array.
                                34, 56, 78, 90, 23  ==> 56, 78, 90, 23, 34
*/

#include <iostream>
using namespace std;
int main(){

    int arraySize;
    cout<<"How many numbers will you enter: ";
        cin>>arraySize;

    int nums[arraySize];

    for(int i=0; i<arraySize; i++){
        cout<<"Enter number: "<<(i+1)<<" :";
            cin>>nums[i];
    }
    cout<<"Elements of the array: "<<endl;

    for(int i=0; i<arraySize; i++){
        cout<<"["<<i<<"}: "<<nums[i]<<"\t";
    }

    for(int j=0; j<arraySize; j++){
        int first = nums[0];
        for(int i=1; i<arraySize-j; i++){
            nums[i-1] = nums[i];
        }
        nums[arraySize-1-j] = first;
    }
    cout<<"\nElements of the array after rotation: "<<endl;

    for(int i=0; i<arraySize; i++){
        cout<<"["<<i<<"}: "<<nums[i]<<"\t";
    }

    return 0;
}
