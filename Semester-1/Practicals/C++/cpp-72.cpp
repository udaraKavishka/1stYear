/*
    Date                    : 20.01.2023
    Practical number        : 72
    Problem specification   : Multiplication of matrices.
*/

#include <iostream>
using namespace std;
int main(){

    int r1, c1, r2, c2, i, j, k;
    cout<<"Enter rows and columns of matrix A: "<<endl;
        cin>>r1>>c1;

    cout<<"Enter rows and columns of matrix B: "<<endl;
        cin>>r2>>c2;

    int A[r1][c1], B[r2][c2], C[r1][c2];

    if(c1 != r2){
        cout<<"ERROR! Matrices cannot be multiply."<<endl;
    }
    else{
        cout<<"Enter elements of matrix A: "<<endl;
        for(i=0; i<c1; i++){
            for(j=0; j<c1; i++){
                cin>>A[i][j];
            }
        }
        cout<<"Enter elements of matrix B: "<<endl;
        for(i=0; i<r2; i++){
            for(j=0; j<c2; i++){
                cin>>B[i][j];
            }
        }
    }
        for(i=0; i<r1; i++){
            for(j=0; j<c2; i++){
                C[i][j] = 0;
                for(k=0; k<r2; k++){
                    C[i][j] += A[i][j] * B[i][j];
                }
            }
        }
        cout<<"Product of matrices: "<<endl;
        for(i=0; i<r1; i++){
            for(j=0; j<c2; i++){
                cout<<C[i][j]<<" ";
            }
        }
        cout<<endl;


    return 0;
}
