/*
	Date: 15.05.2023
	Practical Number: 29
	Problem Specification: Labled break in java
*/

class JavaEx29{
	public static void main(String args[]){
		
		//The for loop is labled as first
		first:
		
		for(int i=1; i<5; i++){
			
			//The next for loop is labled as second
			second:
			
			for(int j=1; j<3; j++){
				System.out.println("i = " + i + ", j = " + j);
				
				if(i == 2){
					break first;
				}
			}
		}
	}
}