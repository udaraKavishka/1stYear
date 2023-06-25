/*
    Date: 21.11.2022
    Practical number: 41
    Problem specification: using continue statement in for loop
*/

#include <iostream>
using namespace std;
int main(){

    for(int i=0; i<=10; i++)
    {

        cout<<i<<endl;
        if(i==5){
            continue;
        }
    }

    return 0;
}
