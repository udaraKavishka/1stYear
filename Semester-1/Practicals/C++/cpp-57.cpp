/*
    Date: 16.12.2022
    Practical number: 57
    Problem specification: Write a program in c++ to to count all integer between 100 and 200 which are divisible by 9.
*/

#include <iostream>
using namespace std;
int main(){

    int i;
    cout<<"All integer between 100 and 200 which are divisible by 9: "<<endl;

    for(int i=100; i<200; ++i){
        if(i%9==0){
            cout<<" "<<i;
        }
    }

    return 0;
}
