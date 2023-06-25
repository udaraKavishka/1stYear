/*
	Date: 15.05.2023
	Practical Number: 52
	Problem Specification: Find the total, average, largest array element and, 
							smallest array element using length of the array 
							is 5 and the array name as student
*/

class JavaEx52{
	public static void main(String[] args){

		int[] student = {50, 60, 80, 90, 30};
		int sum = 0;
		
		for(int marks:student){
			sum += marks;
		}
		System.out.println("Sum is: " + sum);
		
		double average = sum / student.length;
			System.out.println("Average is: " + average);
		
		int Max = student[0];
		for(int i=0; i<5; i++){
			if(Max < student[i]){
				Max = student[i];
			}
		}
		System.out.println("Maximum marks is: " + Max);
		
		int Min = student[0];
		for(int i=0; i<5; i++){
			if(Min > student[i]){
				Min = student[i];
			}
		}
		System.out.priintln("Minimum mark is: " + Min);
	}
}