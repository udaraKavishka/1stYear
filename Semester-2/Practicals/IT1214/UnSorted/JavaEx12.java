/*
	Date:
	Practical Number: 12
	Problem Specification: Prints a number whether it is positive or negative
*/

import java.util.Scanner;

	public class JavaEx12{
		public static void main(String[] args){
			Scanner ai = new Scanner(System.in);

		int number = ai.nextInt();

		if(number >= 0){
			System.out.println("The number is positive.");
		}
		else{
			System.out.println("The number is negative.");
		}
	}
}