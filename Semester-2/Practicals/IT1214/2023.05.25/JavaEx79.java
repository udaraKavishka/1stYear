/*
	Date: 25.05.2023
	Practical Number: 79
	Problem Specification: Create a class Rectangle
							Attributes length, width
							Method findArea(), findParimeter()
							Create a rectangle object by passing length and width values
*/

class Rectangle{
	double length, width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public void findArea(){
		System.out.println("Area is: " + length * width);
	}
	
	public void findParimeter(){
		System.out.println("Perimeter is: " + 2*(length + width));
	}
	
	public static void main(String[] args){
		Rectangle obj1 = new Rectangle(8, 6);
		obj1.findArea();
		obj1.findParimeter();
	}
}