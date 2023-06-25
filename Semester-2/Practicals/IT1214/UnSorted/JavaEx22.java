/*
	Date:
	Practical Number: 22
	Problem Specification: Sum of the positive numbers using while loop take the integer from the user
*/

import java.util.Scanner;

class JavaEx22{
	public static void main(String args[]){

		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		while(number>=0){
			sum += number;
				System.out.println("Enter a number: ");
			number = input.nextInt();
		}
		System.out.println("Sum: "+ sum);
		input.close();
	}
}