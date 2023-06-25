/*
    Date                    : 20.01.2023
    Practical number        : 71
    Problem specification   : Addition of matrices.
*/

#include <iostream>
using namespace std;
int main(){

    int m, n, p, q;
    cout<<"Enter rows and columns of matrix A: "<<endl;
        cin>>m>>n;

    cout<<"Enter rows and columns of matrix B: "<<endl;
        cin>>p>>q;

    int arr1[m][n], arr2[p][q], arr3[m][n];

    if((m != p) && (n != q)){
        cout<<"Matrix cannot be added"<<endl;
        exit(0);
    }

    cout<<"Enter elements of matrix A: "<<endl;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            cin>>arr1[i][j];
        }
    }
    cout<<"Enter elements of matrix B: "<<endl;
    for(int i=0; i<p; i++){
        for(int j=0; j<q; j++){
            cin>>arr2[i][j];
            arr3[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    for(int i=0; i<p; i++){
        for(int j=0; j<q; j++){
            arr3[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    cout<<"Sum of matrices: "<<endl;

    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            cout<<arr3[i][j]<<" ";
        }
        cout<<endl;
    }

    return 0;
}
