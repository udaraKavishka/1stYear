/*
	Date: 18.05.2023
	Practical Number: 64
	Problem Specification: Generate multiplication table using for loop
*/

class JavaEx64{
	public static void main(String[] args){

		int num = 5;
		
		for(int i=1; i<=10; ++i){
			System.out.printf(" \n" + num " " + i + " " + num * i);
		}
	}
}