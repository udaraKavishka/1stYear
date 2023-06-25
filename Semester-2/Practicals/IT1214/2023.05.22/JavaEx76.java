/*
	Date: 22.05.2023
	Practical Number: 76
	Problem Specification: 
*/

class JavaEx76{
	int num1 = 10, num2 = 20, num3;
	
	int addNum(){
		num3 = num1 + num2;
		return num3;
	}
	
	public static void main(String[] args){
		JavaEx76 obj = new JavaEx76();
		System.out.println(obj.addNum());
	}
}