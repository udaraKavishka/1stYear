/*
	Date: 22.05.2023
	Practical Number: 77
	Problem Specification: Create methods add, sub in class calculator
							Get teo numbers from user input and store the values
							Call the methods by creating an object
*/

import java.util.Scanner;

class Calculator{
	int sum(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
	int sub(int num1, int num2){
		int sum = num1 - num2;
		return sub;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value for number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a value for number 2: ");
		int num2 = sc.nextInt();
		
		Calculator obj = new Calculator();
		
		System.out.println("The sum is: " + obj.sum(a, b));
		System.out.println("The sub is: " + obj.sub(a, b));
	}
}