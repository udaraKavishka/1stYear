/*
    Date                    : 19.12.2022
    Practical number        : 65
    Problem specification   : Create an integer array with the size of 10
                                1. Get the values from the user to store in the array.
                                2. Find the remainder by 2 and store at the index[6].
                                3. Count the odd and even.
*/

#include <iostream>
using namespace std;
int main(){

    int arr[10], count_odd = 0, count_even = 0;

    for(int i=0; i<10; i++){
        cout<<"Enter value "<<i<<": ";
            cin>>arr[i];
        arr[i] = arr[i] % 2;
        if(arr[i] == 1){
            count_odd++;
        }
        else{
            count_even++;
        }
        cout<<count_odd<<endl<<count_even;
    }

    return 0;
}
