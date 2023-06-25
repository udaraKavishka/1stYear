/*
	Date: 19.06.2023
	Practical Number: 89
	Problem Specification: Write a java program to create an abstract class shape with abstract 
							methods calculateArea() and calculatePerimeter()
							
							Create subclasses Circle, Triangle and Rectangle that extand the shape class implement 
							the respective methods to calculate the area and perimeter of each shape.
*/	

abstract class Shape{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	double calculateArea(){
		return Math.PI * radius * radius;
	}
	
	double calculatePerimeter(){
		return 2 * Math.PI * radius;
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	double calculateArea(){
		return length * width;
	}
	
	double calculatePerimeter(){
		return 2 * (length + width);
	}
}

class Triangle extends Shape{
	private double base1;
	private double base2;
	private double base3;
	
	public Triangle(double base1, double base2, double base3){
		this.base1 = base1;
		this.base2 = base2;
		this.base3 = base3;
	}
	
	double calculateArea(){
	double s = (base1 + base2 + base3) / 2;
		return Math.sqrt(s * (s - base1) * (s - base2) * (s - base3));
	}
	
	double calculatePerimeter(){
		return base1 + base2 + base3;
	}
}

public class JavaEx89{
	public static void main(String[] args){
		
		Shape c1 = new Circle(5.0);
			System.out.println("Area of the Circle: " + c1.calculateArea());
			System.out.println("Perimeter of the Circle: " + c1.calculatePerimeter());
			
		Shape r1 = new Rectangle(10.0, 15.0);
			System.out.println("Area of the Recatngle: " + r1.calculateArea());
			System.out.println("Perimeter of the Recatngle: " + r1.calculatePerimeter());
			
		Shape t1 = new Triangle(5.0, 6.0, 7.0);
			System.out.println("Area of the Triangle: " + t1.calculateArea());
			System.out.println("Perimeter of the Triangle: " + t1.calculatePerimeter());
	}
}