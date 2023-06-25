/*
	Date: 18.05.2023
	Practical Number: 59
	Problem Specification: 
*/

import java.util.Arrays;

class JavaEx59{
	public static void main(String[] args){

		int[][] source = {
							{1, 2, 3, 4},
							{5, 6},
							{0, 2, 42, -4, 5}
						};
		
		int [][] destination = new int[source.length][];
		
		for(int i=0; i<destination.length; i++){
			destination[i] = new int[source[i].length];
			
			for(int j=0; j<destination[i].length; j++){
				destination[i][j] = source[i][j];
			}
		}
		System.out.priintln(Arrays.deepToString(destination));
	}
}