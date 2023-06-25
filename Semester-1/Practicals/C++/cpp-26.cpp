/*
    Date: 04.11.2022
    Practical number: 26
    Problem specification: Find the point from a range of points using switch case
*/

#include <iostream>
using namespace std;

int main(){

    int points;
    cout<<"Enter your points: ";
        cin>>points;

    switch(points){

        case 8 ... 10:
            cout<<"Excellent";
        break;

        case 5 ... 7:
            cout<<"Good";
        break;

        case 1 ... 4:
            cout<<"Poor";
        break;

        default:
            cout<<"Looking for points!";
    }

    return 0;

}
