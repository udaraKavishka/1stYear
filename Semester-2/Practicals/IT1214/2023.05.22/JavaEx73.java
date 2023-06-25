/*
	Date: 22.05.2023
	Practical Number: 73
	Problem Specification: 
*/

class JavaEx73{
	public static void main(String[] args){
		
		String s = "Radar", rs = "";
		int sl = s.length();
		
		for(int i=(sl-1); i>=0; --i){
			rs = rs + s.charAt(i);
		}
		if(s.toLowerCase().equals(rs.toLowerCase())){
			System.out.println(s + " is a palindrome string.");
		}
		else{
			System.out.println(s + " is not a palindrome string.");
		}
	}
}