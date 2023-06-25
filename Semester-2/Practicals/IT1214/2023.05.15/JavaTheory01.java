class JavaTheory01{
	public static void main(String[] args){
		
		int studentArray[] = {55, 65, 75, 85, 95};
		int sum =0;
		
		//Initilize a variable sum to get the total
		//use for each loop to add the marks to sum
		for(int marks: studentArray){
			sum += marks;
		}
		System.out.println("The total of the marks: " + sum);
		
		//avg = sum/length of array
		double average = (double)sum/studentArray.length;
		System.out.println("The average of the marks: " + average);
	}
}