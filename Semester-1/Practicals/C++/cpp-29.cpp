/*
    Date: 11.11.2022
    Practical number: 29
    Problem specification: Write c++ program to display the following number
                            series 100,110,120,130,.........,550
*/

#include <iostream>
using namespace std;
int main(){

    int i;
    for(i=100;i<=550;i++)
    {
        if(i%10==0)
            {
                cout<<i<<",";
            }
    }

    return 0;
}
