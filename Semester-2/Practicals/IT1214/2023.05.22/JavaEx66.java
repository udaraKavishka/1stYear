/*
	Date: 22.05.2023
	Practical Number: 66
	Problem Specification: 
*/

class JavaEx66{
	int num1 = 10, num2 = 20;
	int num3;
	
	int addNum(){
		num3 = num1 + num2;
		return num3;
	}
	
	public static void main(String[] args){
		JavaEx66 obj = new JavaEx66();
		System.out.println(obj.addNum());
	}
}