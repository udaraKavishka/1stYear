/*
    Date: 25.11.2022
    Practical number: 50
    Problem specification: print * pyramid by using 'while' loop
*/

#include <iostream>
using namespace std;
int main(){

    int i=1;

    while(i<=5)
    {
        int j=1;
        while(j<=i){
            cout<<"* "<<" ";
            j++;
        }
        cout<<"\n";
        i++;
    }

    return 0;
}
