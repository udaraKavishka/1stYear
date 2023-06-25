/*
	Date:
	Practical Number: 09
	Problem Specification: Double to int & double to short conversion
*/

class JavaEx09{
	public static void main(String[] args){

		char alphabet = 'j';
		System.out.println("The letter is : "+ alphabet);
		
		int ascii = alphabet;
		System.out.println("The ascii value of letter  is : "+ ascii);

		//double to int conversion
		double interest = 14.02;
		System.out.println("The interest is : "+ interest);

		int doubleToInt = (int)interest;
		System.out.println("The interest value after conversion is : "+ doubleToInt);

		//double to short conversion
		double num1 = 18.43;
		System.out.println("The double value : "+ num1);

		short doubleToShort = (short)num1;
		System.out.println("The short value : "+ doubleToShort);
	}
}