/*
	Date: 22.05.2023
	Practical Number: 70
	Problem Specification: Calculate power of a number using a while loop
*/

class JavaEx70{
	public static void main(String[] args){
		
		int base = 3, exponent = 4;
		long result;
		
		while(exponent != 0){
			result *= base;
			--exponent;
		}
		System.out.println("Result is: " + result)
	}
}