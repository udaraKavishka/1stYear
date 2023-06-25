/*
	Date: 15.05.2023
	Practical Number: 47
	Problem Specification: 
*/

class JavaEx47{
	public static void main(String[] args){

		int[] student = {80, 45, 78, 65, 60};
		double total = 0.0;
		
		for(int i=0; i<5; i++){
			total += student[i];
		}
		System.out.println("Total is: " + total);
		System.out.println("Average is: " + (total/5));
	}
}