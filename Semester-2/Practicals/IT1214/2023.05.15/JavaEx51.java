/*
	Date: 15.05.2023
	Practical Number: 51
	Problem Specification: Find the smallest array element in array student
*/

class JavaEx51{
	public static void main(String[] args){

		int[] student = {50, 60, 80, 90, 30};
		int Min = student[0];
		
		for(int i=0; i<5; i++){
			if(Min < student[i]){
				Min = student[i];
			}
		}
		System.out.println("Minimum mark is: " + Min);
	}
}