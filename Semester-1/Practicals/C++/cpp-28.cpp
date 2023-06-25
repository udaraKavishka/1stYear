/*
    Date: 04.11.2022
    Practical number: 28
    Problem specification: Using for loop and understand it with method wise
*/

#include <iostream>
using namespace std;

int main(){

    cout<<"Method 01:"<<endl;
    for(int i=1;i<=10;i++)
    {
        cout<<i<<" ";
    }
    cout<<endl;

    cout<<"\nMethod 02:"<<endl;
    for(int i=1;i<11;i++)
    {
        cout<<i<<" ";
    }
    cout<<endl;

    cout<<"\nMethod 03:"<<endl;
    for(int i=0;i<=10;i++)
    {
        cout<<i+1<<" ";
    }
    cout<<endl;

    cout<<"\nMethod 04:"<<endl;
    for(int i=0;i<=10;i++)
    {
        cout<<i++<<" ";
    }
    cout<<endl;

    cout<<"\nMethod 05:"<<endl;
    for(int i=0;i<=10;i++)
    {
        cout<<++i<<" ";
    }
    cout<<endl;

    return 0;

}
