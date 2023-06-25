/*
	Date: 18.05.2023
	Practical Number: 61
	Problem Specification: Find factorial of a number using for loop
*/

class JavaEx61{
	public static void main(String[] args){

		int num = 5;
		long factorial = 1;
		
		for(int i=1; i<=num; ++i){
			factorial *= i;
		}
		System.out.println("Factorial of %d %d", num, factorial);
	}
}