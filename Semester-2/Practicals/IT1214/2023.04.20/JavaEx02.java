/*
	Date: 20.04.2023
	Practical Number: 02
	Problem Specification: How to use addition, subtraction, multiplication and, division in java programming
*/

class JavaEx02{
	public static void main(String[] args){
		
		int num1, add, num2, sub=0, mult=0, mod;
		double div=0;
		
		num1 = 10;
		num2 = 25;
		
		add = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num2 / num1;
		mod = num2 % num1;
		
		System.out.println(num1 + " + " + num2 + " = " + add);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + mult);
		System.out.println(num2 + " / " + num1 + " = " + div);
		System.out.println(num2 + " + " + num1 + " = " + mod);
		
		System.out.println(num1 + "+" + num2 + "=" + add + "\n" + num2 + "-" + num1 + "=" + sub + "\n"+ num2 + "/" + num1 + "=" + div + "\n" + num2 + "/" + num1 + "=" + div + "\n" + num1 + "*" + num2 + "=" + mult + "\n" + num2 + "%" + num1 + "=" + mod);
	}
}