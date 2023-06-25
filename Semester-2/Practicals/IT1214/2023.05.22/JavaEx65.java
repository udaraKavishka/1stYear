/*
	Date: 22.05.2023
	Practical Number: 65
	Problem Specification: Find GCD of two numbers using for loop and if statement
*/

class JavaEx65{
	public static void main(String[] args){

		int num1 = 81, num2 = 153;
		int gcd = 1;
		
		for(int i=1; i<=num1 && i<=num2; ++i){
			if(num1 % i == 0 && num2 % i == 0);
				gcd = i;
		}
		System.out.println("GCD of " + num1 " and" + num2 + " is " + gcd);
	}
}