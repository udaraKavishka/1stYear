/*
	Date: 29.05.2023
	Practical Number: 82
	Problem Specification: Overload the method sum() for the num1, num4
							Overload the method sum() for the num1, num4, num1
*/

class MathOverLoading{
	int num1, num2, num3;
	double num4, num5;
	
	public int sum(int a, int b){
		return a + b;
	}
	
	public int sum(int a, int b, int c){
		return (a + b + c);
	}
	
	public int sum(double a, double b){
		//double --> int
		return (int)(a + b);
	}
	
	public int sum(double a, int b){
		//double --> int
		return (int)(a + b);
	}
	
	public static void main(String[] args){
		MathOverLoading obj1 =  new MathOverLoading();
			System.out.println(obj1.sum(2, 3));
			System.out.println(obj1.sum(2.8, 3.56));
			System.out.println(obj1.sum(2, 3, 10));
			System.out.println(obj1.sum(2.78, 3));
	}
}