/*
    Date                    : 19.12.2022
    Practical number        : 64
    Problem specification   : Create an array with the value 9, 18, 27, 36, 45, 54
                                1. Display the 4th value of the array.
                                2. Find the summation of 3rd & 5th values.
                                3. Update the 2nd index value as 96.
*/

#include <iostream>
using namespace std;
int main(){

    int arr[6] = {9, 18, 27, 36, 45, 54};
    int sum = 0;

    cout<<"arr["<<4<<"]: "<<arr[3]<<endl;

    sum = arr[2] + arr[4];
    cout<<"The sum of the 3rd & 5th values: "<<sum<<endl;

    arr[2] = 96;
    cout<<"Updated 2nd index value: "<<arr[2]<<endl;

    return 0;
}
