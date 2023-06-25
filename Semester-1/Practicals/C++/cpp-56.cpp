/*
    Date: 16.12.2022
    Practical number: 56
    Problem specification: Write a program in c++ to check whether a number be expressed as a sum of two prime numbers.
*/

#include <iostream>
using namespace std;
int main(){

    int num, i, flag1 = 1, flag2 = 1, flag3 = 0, j;
    float sum = 0;

    cout <<"Input  a positive integer: ";
        cin >> num;

    for(int i=2; i<=num/2;i++){
        flag1 = 1;
        flag2 = 1;
        for(int j=2; j<i; j++){
            if(i % j == 0){
                flag1 = 0;
                j = i;
            }
        }
        for(int j = 2; j < num - i; j++){
            if((num - i) % j == 0){
                flag2 = 0;
                j = num - i;
            }
        }
        if(flag1 == 1 && flag2 == 1){
            cout<<num<<" = "<<i<<" + "<<num - i<<endl;
            flag3 = 1;
        }
    }
    if(flag3 == 0){
        cout<<num<<" can not be expressed as sum of two prime numbers."<<endl;
    }

    return 0;
}
