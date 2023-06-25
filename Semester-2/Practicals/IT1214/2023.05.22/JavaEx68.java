/*
	Date: 22.05.2023
	Practical Number: 68
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
	
	public void printGPA(){
		System.out.println("The GPA is: " + gpa)
	}
	
	public static void main(String[] args){
		Student obj1 = new Student();
		obj1.name = "Tony";
		obj1.age = 24;
		obj1.gpa = 3.65;
		obj1.printGPA();
		
		Student obj2 = new Student();
		obj1.name = "Vijay";
		obj1.age = 20;
		obj1.gpa = 3.9;
		obj1.printGPA();
	}
}