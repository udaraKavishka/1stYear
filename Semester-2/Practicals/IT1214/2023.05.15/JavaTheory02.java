class JavaTheory2{
	public static void main(String[] args){
		
		//Q1: Find the largest element in array studentArray
		int largest = studentArray[0];
		for(int marks: studentArray){
			if(marks > largest){
				largest = marks;
			}
			if(marks < smallest){
				smallest = marks;
			}
		}
		System.out.println("The largest element: " + largest);

		//Q2: Find the smallest element in array studentArray
		System.out.println("The smallest element: " + smallest);
	}
}