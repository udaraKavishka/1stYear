/*
    Date: 12.12.2022
    Practical number: 52
    Problem specification: Display the following pattern
                            1111111111
                            2222222222
                            3333333333
                            4444444444
                            5555555555
                            6666666666
                            7777777777
                            8888888888
                            9999999999
*/

#include <iostream>
using namespace std;
int main(){

    int a, b;

    for(int a=1; a<10; ++a){

        for(int b=1; b<10; ++b)
            cout<<a<<" ";
            cout<<endl;
    }
}

