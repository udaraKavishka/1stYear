/*
	Date:
	Practical Number: 15
	Problem Specification: Get user input as a mark and check whether what it is
*/

import java.util.Scanner;

public class JavaEx15{
	public static void  main(String args[]){

		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enteryour marks: ");
		int marks = ab.nextInt();

		if(marks<=100 && marks>=90){
			System.out.println("Your grade is A");
		}
		else if(marks<90 && marks>=80){
			System.out.println("Your grade is B");
		}
		else if(marks<80 && marks>=70){
			System.out.println("Your grade is C");
		}
		else if(marks<70 && marks>=50){
			System.out.println("Your grade is D");
		}
		else if(marks<50 && marks>=0){
			System.out.println("Your grade is E");
		}
		else{
			System.out.println("Recheck your marks");
		}
	}
}