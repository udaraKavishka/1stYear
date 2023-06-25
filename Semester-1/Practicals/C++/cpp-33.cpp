 /*
    Date: 11.11.2022
    Practical number: 33
    Problem specification: Count the even numbers between 50 and 100
*/

#include <iostream>
using namespace std;
int main(){

    int i, c=0;
    for(i=50;i<100;i+=2)
    {
        c++;
    }
    cout<<"Count of even numbers between 50 to 100: "<<c<<endl;

    return 0;
}
