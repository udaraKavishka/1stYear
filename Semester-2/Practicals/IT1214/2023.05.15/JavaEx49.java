/*
	Date: 15.05.2023
	Practical Number: 49
	Problem Specification: How to find the total and average if the length of the array is 5 and name is student
*/

class JavaEx49{
	public static void main(String[] args){

		int[] student = {50, 60, 80, 90, 30};
		int sum = 0;
		
		for(int marks:student){
			sum += marks;
		}
		System.out.println("Sum is: " + sum);
		
		double average = sum / student.length;
		System.out.println("Average is: " + average);
	}
}