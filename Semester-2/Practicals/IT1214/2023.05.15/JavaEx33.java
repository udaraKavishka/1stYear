/*
	Date: 15.05.2023
	Practical Number: 33
	Problem Specification: Arrays in java
*/

class JavaEx33{
	public static void main(String args[]){

		double data[];
		
		data = new double[5];
		
		data[0] = 5.0;
		data[1] = 4.7;
		data[2] = 7.0;
		data[3] = 8.7;
		data[4] = 5.2;
		
		System.out.println("First element: " + data[0]);
		System.out.println("Second element: " + data[1]);
		System.out.println("Third element: " + data[2]);
		System.out.println("Fourth element: " + data[3]);
		System.out.println("Fifth element: " + data[4]);
	}
}