/*
    Date: 25.11.2022
    Practical number: 51
    Problem specification: print inverted half * pyramid by using 'while' loop
*/

#include <iostream>
using namespace std;
int main(){

    for(int i=1; i<=10; i++){

        for(int j=i; j<=10; j++){
            cout<<"* "<<" ";
        }
    cout<<"\n";
    }

    return 0;
}
