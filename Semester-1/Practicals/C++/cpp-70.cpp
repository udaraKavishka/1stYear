/*
    Date                    : 16.01.2023
    Practical number        : 70
    Problem specification   : Understand about the two dimensional array.
*/

#include <iostream>
using namespace std;
int main(){

    int anArray1[2][3] = {
        {23, 45, 57},
        {56, 78, 90}
    };
    int anArray2[3][5] = {
        {45, 56, 78, 90, 52},
        {78, 90, 21, 54, 52},
        {43, 32, 54, 76, 88}
    };
    for(int row=0; row<2; row++){
        for(int col=0; col<3; col++){
            cout<<"["<<row<<"]["<<col<<"]: "<<anArray1[row][col]<<"\t";
        }
        cout<<endl;
    }
    cout<<"\n\n";

    for(int row=0; row<5; row++){
        for(int col=0; col<5; col++){
            cout<<"["<<row<<"]["<<col<<"]: "<<anArray2[row][col]<<"\t";
        }
        cout<<endl;
    }

    return 0;
}
