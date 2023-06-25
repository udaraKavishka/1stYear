/*
    Date: 16.12.2022
    Practical number: 58
    Problem specification: Write a program in c++ to display the number in reverse order.
*/

#include <iostream>
using namespace std;
int main(){

    int num, rev=0, term;

    cout<<"Enter a number: ";
        cin>>num;

    while(num!=0){
        term=num%10;
        rev=rev*10 + term;
        num/=10;
    }
    cout<<"Reverse number is: "<<rev<<endl;

    return 0;
}
