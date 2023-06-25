/*
	Date:
	Practical Number: 08
	Problem Specification: Get user inputs and check data types in java
*/

import java.util.Scanner;

public class JavaEx08{
	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your salary : ");
		double salary = sc.nextFloat();
		
		System.out.println("Enter your interest for saving: ");
		float interest = sc.nextFloat();
		
		System.out.println("Enter your city : ");
		String city = sc.next();
		
		System.out.println("Are you single : ");
		boolean isSingle = sc.nextBoolean();
		
		System.out.println("Enter your first initial : ");
		char initial = sc.next().charAt(0);
			System.out.println("Enter your age : " + age);
			System.out.println("Enter your salary : " + salary);
			System.out.println("Enter your interest for saving: " + interest);
			System.out.println("Enter your city : " + city);
			System.out.println("Are you single : " + isSingle);
			System.out.println("Enter your first initial : " + initial);
	}
}