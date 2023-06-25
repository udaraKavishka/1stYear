/*
	Date: 25.05.2023
	Practical Number: 78
	Problem Specification: Create a class Pen which has attributes color and type(gel/ ballpoint) and a method write()
							Create a parameterized constructor
							Create 2 objects of pen class
								obj1: blue gel
								obj2: red ballpoint
*/

class Pen{
	String color, type;
	
	Pen(String color, String type){
		this.color = color;
		this.type = type;
	}
	
	public void write(){}
	
	public static void main(String[] args){
		Pen obj1 = new Pen("blue", "gel");
			System.out.println("Pen color is: " + obj1.color);
			System.out.println("Pen type is: " + obj1.type);
		
		Pen obj2 = new Pen("red", "ballpoint");
			System.out.println("Pen color is: " + obj2.color);
			System.out.println("Pen type is: " + obj2.type);
	}
}