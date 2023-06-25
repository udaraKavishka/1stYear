/*
    Date: 21.11.2022
    Practical number: 44
    Problem specification: Ask the user to enter a number and value for power and find the factorial for the numbers
                            2^3=2*2*2=8
*/

#include <iostream>
#include <cmath>
using namespace std;
int main(){

    int num,p,p1,result=1;

    cout << "Enter a Number: " << endl;
        cin >> num;
    cout << "Enter a Power: " << endl;
        cin >> p;


    /*

    for(int i=0;i<p;i++)
    {
        result=result*num;
    }

    cout << "Factorial is " << result << endl;

    */


    p1=p;
    while(p1>0)
    {
        result=result*num;
        --p1;
    }
    cout << "Factorial is " << result << endl;

   /*

    do{
        result=result*num;
        --p1;
    }while(p1>0);

    cout << "Factorial is " << result << endl;

    */

    return 0;
}
