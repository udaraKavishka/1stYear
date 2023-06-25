/*
	Date: 24.04.2023
	Practical Number: 05
	Problem Specification: How to print an integer entered by an user
*/

import java.util.Scanner;

public class JavaEx05{
	public static void main(String[] args){

		Scanner reader = new Scanner(System.in);
			System.out.print("Enter a number: ");

		//nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();

		//println() prints the following line to the output screen
		System.out.println("You entered: " + number);
	}
}