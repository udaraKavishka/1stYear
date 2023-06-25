/*
	Date: 15.05.2023
	Practical Number: 30
	Problem Specification: Continue statement in java
*/

class JavaEx30{
	public static void main(String args[]){
		
		for(int i=1; i<=10; ++i){
			if(i>4 && i<9){
				continue;
			}
			System.out.println(i);
		}
	}
}