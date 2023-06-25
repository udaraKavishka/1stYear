/*
    Date: 12.12.2022
    Practical number: 54
    Problem specification: Write a program in c++ to display the cube of the number up to given an integer.
*/

#include <iostream>
using namespace std;
int main(){

    int a, term, cube;

    cout<<"Input the number of terms: ";
        cin>>term;

    for(int a=1; a<=term; ++a){

        cube = a * a * a;
        cout<<"Number is: "<<a<<" and the cube of "<<a<<" is: "<<cube<<endl;
    }

    return 0;
}
