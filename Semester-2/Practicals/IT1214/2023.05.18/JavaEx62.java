/*
	Date: 18.05.2023
	Practical Number: 62
	Problem Specification: Display fibonacci series
*/

class JavaEx62{
	public static void main(String[] args){

		int num = 10, firstTerm = 0, secondTerm = 1;
		
		System.out.println("Fibonacci series till " + num + " terms: ");
		
		for(int i=1; i<=num; ++i){
			System.out.println(firstTerm + ", ");
			
			//compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}