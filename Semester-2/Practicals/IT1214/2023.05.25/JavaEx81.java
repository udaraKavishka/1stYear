/*
	Date: 25.05.2023
	Practical Number: 81
	Problem Specification: Create a class Rectangle
							Attributes length, width
							Method findArea(), findParimeter()
							Create a rectangle object by passing length and width values
*/

class Rectangle{
	int length, width;
	
	Rectangle(){
		length = 10;
		width = 5;
	}
	
	Rectangle(int length){
		this.length = length;
		width = 3;
	}
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int findArea(){
		return length * width;
	}
	
	public int findParimeter(){
		return 2*(length + width);
	}
	
	public double findArea(int radius){
		return radius * radius * Math.PI;
	}
	
	public static void main(String[] args){
		Rectangle obj1 = new Rectangle();
			System.out.println(obj1.findArea());
			System.out.println(obj1.findPerimeter());
			
		Rectangle obj2 = new Rectangle();
			System.out.println(obj2.findArea());
			System.out.println(obj2.findPerimeter());
			
		Rectangle obj3 = new Rectangle();
			System.out.println(obj3.findArea());
			System.out.println(obj3.findPerimeter());
			
		Rectangle circle = new Rectangle();
			System.out.println(circle.findArea(5));
	}
}