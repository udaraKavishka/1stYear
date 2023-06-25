/*
    Date                    : 28.12.2022
    Practical number        : 66
    Problem specification   : Find the maximum number of below array.
                                arr[10] = {56, 78, 96, 35, 43, 61, 87, 64, 82, 25}
*/

#include <iostream>
using namespace std;
int main(){

    int arr[10] = {56, 78, 96, 35, 43, 61, 87, 64, 82, 25};

    int maximum = arr[10];

    for(int i=1; i<=9; i++){
        if(arr[i] > maximum)
            maximum = arr[i];
    }
    cout<<"The maximum number is: "<<maximum<<endl;

    return 0;
}
