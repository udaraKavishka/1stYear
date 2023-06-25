/*
	Date: 18.05.2023
	Practical Number: 60
	Problem Specification: Check the given year is leap or not
*/

class JavaEx60{
	public static void main(String[] args){

		int year = 1900;
		boolean leap = false;
		
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					leap = true;
				}
				else{
					leap = false;
				}
			}
			else{
				leap = true;
			}
		}
		else{
			leap = false;
		}
		
		if(leap){
			System.out.println(year + " is a leap year.");
		}
		else{
			System.out.println(year + " is not a leap year.");
		}
	}
}