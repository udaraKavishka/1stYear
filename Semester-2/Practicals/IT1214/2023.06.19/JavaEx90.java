/*
	Date: 19.06.2023
	Practical Number: 90
	Problem Specification: Create an abstract class called Person with the following properties and methods:
							Properties:
							name(String): Represent the name of the person.
							
							Methods:
							getName(): Returns the name of the person
							displayInfo(): An abstract method that displays information about the person
							
							create an interface called Student with the following methods:
							getId(): Returns the ID of the student.
							getGrade(): Returns the grade of the student.
							
							Create a class called Undergraduate that extends the Person abstract class
							and implements the Student interface.
							
							Implement the displayInfo() method from the Person class and the getId() and
							getGrade() methods from the Student interface with apropriate functionality.
							
							In the Main class, create an object of the Undergraduate class, set its properties,
							and use the methods to display the information.
*/

abstract class Person{
	protected String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void displayInfo();
}

interface Student{
	int getId();
	String getGrade();
}

class Undergraduate extends Person implements Student{
	private int id;
	private String grade;
	
	public Undergraduate(String name, int id, String grade){
		super(name);
		this.id = id;
		this.grade = grade;
	}
	
	public int getId(){
		return id;
	}
	
	public String getGrade(){
		return grade;
	}
	
	public void displayInfo(){
		System.out.println("Name of the undergraduate student: " + getName());
		System.out.println("ID of the undergraduate student: " + getId());
		System.out.println("Grade of the undergraduate student: " + getGrade());
	}
}

public class JavaEx90{
	public static void main(String[] args){
		
		Undergraduate ug1 =  new Undergraduate("Anura Perera", 12345, "A");
		ug1.displayInfo();
	}
}