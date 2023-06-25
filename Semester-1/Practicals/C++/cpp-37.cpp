/*
	Date: 18.11.2022
    Practical number: 37
    Problem specification: Find the length of a given integer number
*/

#include <iostream>
using namespace std;
int main()
{
	int num, c = 0;

	cout<<"Enter the number: ";
		cin>>num;

	while(num>0)
	{
		num = num / 10;
		c++;
	}
	cout<<"Length of a given integer: "<<c<<endl;

	return 0;
}
