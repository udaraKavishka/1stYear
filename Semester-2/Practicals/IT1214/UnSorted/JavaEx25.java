/*
	Date:
	Practical Number: 25
	Problem Specification: Print sum of the positive numbers using while loop take the integer from user
*/

import java.util.Scanner;

class JavaEx25{
	public static void main(String args[]){
		
		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		while(n >= 0){
			sum = sum + n;
				System.out.println("Enter a number: ");
			num = sc.nextInt();
		}
		System.out.println("Sum is: " + sum);
	}
}