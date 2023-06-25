/*
    Date: 25.11.2022
    Practical number: 48
    Problem specification: print number box by using 'while' loop
*/

#include <iostream>
using namespace std;
int main(){

    int i=1;

    while(i<10){
        int j=1;
        while(j<10){
            cout<<j<<" ";
            j++;
        }
        cout<<"\n";
        i++;
    }

    return 0;
}
