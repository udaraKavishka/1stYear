/*
	Date: 22.05.2023
	Practical Number: 69
	Problem Specification: Create a class student
							Student has attributes name Age, GPA
							Student has method printGPA()
							Create an object of studentAssign value to the attributes
							call method printGPA()
*/

class Student{
	String name;
	int age;
	double gpa;
	
	student(String name, int age, double gpa){
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	public void printGPA(){
		System.out.println("The GPA is: " + gpa)
	}
	
	public static void main(String[] args){
		Student obj1 = new Student("Tony", 24, 3.65);
			System.out.println("The name is: " + obj1.name);
		obj1.printGPA();
		
		Student obj2 = new Student("Alex", 34, 2.09);
			System.out.println("The name is: " + obj2.name);
		obj2.printGPA();
	}
}