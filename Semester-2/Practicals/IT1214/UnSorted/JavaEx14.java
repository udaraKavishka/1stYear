/*
	Date:
	Practical Number: 14
	Problem Specification: Prints a letter whether it is vowel or consonant
*/

import java.util.Scanner;

class JavaEx14{
	public static void main(String args[]){
		Scanner ai = new Scanner(System.in);
		
		char alph = ai.next().charAt(0);

		if((alph=='a') || (alph=='e') || (alph=='i') || (alph=='o') || (alph=='u')){
			System.out.println("The alphabet is vowel");
		}
		else{
			System.out.println("The alphabet is consonant");
		}  
	}
}