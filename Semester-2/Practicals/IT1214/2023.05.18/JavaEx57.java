/*
	Date: 18.05.2023
	Practical Number: 57
	Problem Specification: Iterate and copy elements to from source to destination
*/

import java.util.Arrays;

class JavaEx57{
	public static void main(String[] args){

		int[] source = {1, 2, 3, 4, 5, 6};
		int[] destination = new int[6];
		
		for(int i=0; i<source.length; i++){
			destination[i] = source[i];
		}
		System.out.priintln(Arrays.toString(destination));
	}
}