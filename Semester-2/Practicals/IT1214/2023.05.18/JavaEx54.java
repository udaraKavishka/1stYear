/*
	Date: 18.05.2023
	Practical Number: 54
	Problem Specification: Print all elements of 2D array using loop
*/

class JavaEx54{
	public static void main(String[] args){

		int[][] a = {
						{1, 2, 3},
						{4, 5, 6, 7},
						{7}
					};
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.priintln("Row is " + [i] + " , column is " + [j] + ": " + (a[i][j]));
			}
		}
	}
}