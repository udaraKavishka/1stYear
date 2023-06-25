/*
	Date: 22.05.2023
	Practical Number: 72
	Problem Specification: 
*/

class JavaEx72{
	public static void main(String[] args){
		
		String s = "Radar", rs = "";
		int sl = s.length();
		
		for(int i=(sl-1); i>=0; --i){
			rs = rs + s.charAt(i);
			System.out.println(rs);
		}
		if(s.toLowerCase().equals(rs.toLowerCase())){
			System.out.println(s + " is a palindrome string.");
		}
		else{
			System.out.println(s + " is not a palindrome string.");
		}
	}
}