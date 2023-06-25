/*
	Date:
	Practical Number: 16
	Problem Specification: Switch statement to check t-shirt size
*/

class JavaEx16{
	public static void main(String[] args){

		int number = 42;
		String size;

		switch(number){

			case 29:
				size = "small";
			break;

			case 42:
				size = "medium";
			break;

			case 44:
				size = "large";
			break;

			case 48:
				size = "extra large";
			break;

			default:
				size = "unknown";
			break;
		}
		System.out.println("Size: "+ size);	
	}
}