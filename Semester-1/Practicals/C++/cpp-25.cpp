/*
    Date: 04.11.2022
    Practical number: 25
    Problem specification: Find the grade using different switch case
*/

#include <iostream>
using namespace std;

int main(){

    char c;
    cout<<"Enter your grade: ";
        cin>>c;

    switch(c){

        case 'E':
        case 'e':
        cout<<"Excellent";
        break;

        case 'V':
        case 'v':
        cout<<"Very Good";
        break;

        case 'G':
        case 'g':
        cout<<"Good";
        break;

        default:
        cout<<"Looking for a grade";
    }

        return 0;

}
