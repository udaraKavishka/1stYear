/*
	Date:
	Practical Number: 11
	Problem Specification: swap two nubers [x=5,y=7 --> y=5,x=7]
*/

class JavaEx11{
	public static void main(String[] args){
		
		int x = 5;
		int y = 7;
		
		int c;
			c = y;
			y = x;
			x = c;
		 
		System.out.println("The value of is: "+ x);
		System.out.println("The value of is: "+ y);
	}
}