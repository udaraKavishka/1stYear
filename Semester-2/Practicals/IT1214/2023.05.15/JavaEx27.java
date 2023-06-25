/*
	Date: 15.05.2023
	Practical Number: 27
	Problem Specification: Calculate the sum of numbers entered by the user until users enters a negative number
*/

import java.util.Scanner;

class JavaEx27{
	public static void main(String args[]){
		
		double num, sum = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(true){
			System.out.println("Enter a number: ");
			num = sc.nextInt();
			
			if(num < 0.0){
				break;
			}
			sum = sum + num;
		}
		System.out.println("Sum is: " + sum);
	}
}