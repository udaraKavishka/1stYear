/*
    Date: 21.11.2022
    Practical number: 40
    Problem specification: using break statement in for loop
*/

#include <iostream>
using namespace std;
int main(){

    for(int i=0; i<=10; i++)
    {

        cout<<i<<endl;
        if(i==5){
            break;
        }
    }

    return 0;
}
