/*
	Date: 22.05.2023
	Practical Number: 74
	Problem Specification: 
*/

class JavaEx74{
	public static void main(String[] args){
		
		int num = 3553, rn = 0, r;
		int oNum = num;
		
		while(num != 0){
			r = num % 10;
			rn = rn * 10 + r;
			num /= 10;
		}
		if(oNum == rn){
			System.out.println(oNum + " is a palindrome.");
		}
		else{
			System.out.println(oNum + " is not a palindrome.");
		}
	}
}