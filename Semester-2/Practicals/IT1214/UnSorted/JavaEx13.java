/*
	Date:
	Practical Number: 13
	Problem Specification: Prints a number whether it is odd or even
*/

import java.util.Scanner;

public class JavaEx13{
	public static void main(String[] args){
		Scanner ai = new Scanner(System.in);

		int number = ai.nextInt();

		if(number % 2 == 0){
			System.out.println("The number is even.");
		}
		else{
			System.out.println("The number is odd.");
		}
	}
}