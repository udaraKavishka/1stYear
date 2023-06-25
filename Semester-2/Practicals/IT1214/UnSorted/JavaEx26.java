/*
	Date:
	Practical Number: 26
	Problem Specification: Write a program to display sum of the positive numbers using do while loop take the integer from user
*/

import java.util.Scanner;

class JavaEx26{
	public static void main(String args[]){
		
		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		do{
			sum = sum + num;
				System.out.println("Enter a number: ");
			num = sc.nextInt();
		}
		while(n >= 0);
		System.out.println("Sum is: " + sum);
	}
}