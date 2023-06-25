/*
	Date: 15.05.2023
	Practical Number: 31
	Problem Specification: Compute the sum of 5 numbers if it is positive
*/

import java.util.Scanner;

class JavaEx31{
	public static void main(String args[]){
		
		double num, sum = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<6; i++){
			System.out.print("Enter number " + i + ": ");
			num = sc.nextDouble();
			
			if(num<=0.0){
				continue;
			}
			sum = sum + num;
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}
}