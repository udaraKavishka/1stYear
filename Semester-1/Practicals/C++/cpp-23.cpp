/*
    Date: 28.10.2022
    Practical Number: 23
    Problem Specification: Ask the employer to enter the basic salary and over time hours and find the total salary by using following instructions
                                over time hours > 50;
                                    total salary = basic salary + basic salary * 0.25
                                others:
                                    total salary = basic salary
*/

#include <iostream>
using namespace std;

int main(){

    double tot_sal,bas_sal,oth;
    cout<<"Enter your basic salary: "<<endl;
        cin>>bas_sal;
    cout<<"Enter your over time hours: "<<endl;
        cin>>oth;

    if(oth>50)
    {
        double tot_sal = bas_sal + (bas_sal * 0.25);
        cout<<"Your salary: "<<tot_sal;
    }
    else
    {
        cout<<"Your salary: "<<bas_sal;
    }

    return 0;
}
