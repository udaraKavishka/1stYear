/*
	Date: 15.05.2023
	Practical Number: 50
	Problem Specification: Find the largest array element in array student
*/

class JavaEx50{
	public static void main(String[] args){

		int[] student = {50, 60, 80, 90, 30};
		int Max = student[0];
		
		for(int i=0; i<5; i++){
			if(Max < student[i]){
				Max = student[i];
			}
		}
		System.out.println("Maximum mark is: " + Max);
	}
}