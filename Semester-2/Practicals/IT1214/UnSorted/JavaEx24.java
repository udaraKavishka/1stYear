/*
	Date:
	Practical Number: 24
	Problem Specification: Display sum of natural numbers
*/

import java.util.Scanner;

class JavaEx24{
	public static void main(String args[]){
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			sum = sum + i;
		}
		System.out.println("Sum is: " + sum);
	}
}