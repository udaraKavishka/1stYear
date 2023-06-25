 /*
    Date: 18.11.2022
    Practical number: 34
    Problem specification: Write c++ code for find the fibonacci series for a given number
*/

#include <iostream>
using namespace std;
int main(){

    int num1=0, num2=1, num3, i, num;

    cout<<"Enter the number: "<<endl;
        cin>>num;

    cout<<num1<<" "<<num2<<" ";

    for(i=2; i<num; ++i)
    {
        num3=num1 + num2;

        cout<<num3<<" ";

        num1 = num2;
        num2 = num3;
    }

    return 0;
}
