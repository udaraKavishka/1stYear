/*
    Date: 19.12.2022
    Practical number: 63
    Problem specification: Find the final marks using arrays.
*/

#include <iostream>
using namespace std;
int main(){

    int marks[10] = {50, 60, 23, 50, 60, 23, 50, 60, 23, 50};
    int sum = 0;

    for(int i=0; i<10; i++)
        sum = sum + marks[i];

    int average = sum / 10;

    cout<<"Final marks using array is: "<<average<<endl;

    return 0;
}
