/*
	Date: 18.05.2023
	Practical Number: 55
	Problem Specification: 
*/

class JavaEx55{
	public static void main(String[] args){

		int[][] a = {
						{1, 2, 3},
						{4, 5, 6, 7},
						{7}
					};
		
		for(int[] innerArray:a){
			for(int data:innerArray){
				System.out.print(data + " ");
			}
		}
		System.out.priintln();
	}
}