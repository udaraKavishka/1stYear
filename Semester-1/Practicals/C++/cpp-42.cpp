/*
    Date: 21.11.2022
    Practical number: 42
    Problem specification: using do while loop
*/

#include <iostream>
using namespace std;
int main(){

    /* do{
        statement;
    }while(condition); */

    int i=1;

    //do..while loops #display from 1 to 5

    do{
        cout << i << endl ;
        ++i;
        cout << "Checking i: " << i << endl;
    }
    while(i<=5);

    /* while(i<=5)
     {
         cout << i << " "
         ++i;
     } */

    return 0;
}
