/*
	Date: 18.05.2023
	Practical Number: 63
	Problem Specification: Generate multiplication table using for loop
*/

class JavaEx63{
	public static void main(String[] args){

		int num = 5;
		
		for(int i=1; i<=10; ++i){
			System.out.printf("%d %d %d \n", num, i, num * i);
		}
	}
}