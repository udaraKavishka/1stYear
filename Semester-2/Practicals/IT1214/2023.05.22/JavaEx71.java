/*
	Date: 22.05.2023
	Practical Number: 71
	Problem Specification: Calculate power of a number using a for loop
*/

class JavaEx71{
	public static void main(String[] args){
		
		int base = 3;
		long result;
		
		for(int  exponent = 4; exponent != 0; --exponent){
			result *= base;
		}
		System.out.println("Result is: " + result)
	}
}