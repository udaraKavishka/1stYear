/*
	Date: 15.05.2023
	Practical Number: 48
	Problem Specification: Get user input and display total & average
*/

import java.util.Scanner;

class JavaEx48{
	public static void main(String[] args){

		double total = 0.0;
		int[] student = nejavac JavaEx40.javaw int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			System.out.println("Enter your marks: ");
			student[i] = sc.nextInt();
			total += student[i];
		}
		System.out.println("Total is: " + total);
		System.out.println("Average is: " + (total/5));
	}
}