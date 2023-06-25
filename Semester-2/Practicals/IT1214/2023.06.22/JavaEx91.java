/*
	You have been given the task to design a java program to represent information about people, specifically students and teachers.
	Implement the necessary classes to achieve this.
	Create an abstract class called "Person" with the following attributes and behaviors:
	
	Attributes:
		name(String)
		
	abstract method:
		getRole(): return a string representing the role of the person
*/

abstract class Person{
	protected String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public abstract String getRole();
	
	public String getName(){
		return name;
	}
}

class Student extends Person{
	private int rollNumber;
	private int[] marks;
	
	public Student(String name, int rollNumber, int[] marks){
		super(name);
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public int calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
	
	public int getRollNumber(){
		return rollNumber;
	}
	
	public String getRole(){
		return "Student";
	}
}

class Teacher extends Person{
	private String subject;
	
	public Teacher(String name, String subject){
		super(name);
		this.subject = subject;
	}
	
	public String getSubject(){
		return subject;
	}
	
	public String getRole(){
		return "Teacher";
	}
}

public class JavaEx91{
	public static void main(String[] args){
		
		int[] studentMarks = {55, 65, 75, 85, 95,};
		
		Student s1 = new Student("Sirimal", 12345, studentMarks);
		
		System.out.println("Name of the Student: " + s1.getName());
		System.out.println("Role of the Student: " + s1.getRole());
		System.out.println("Role number of the Student: " + s1.getRollNumber());
		System.out.println("Average marks of the Student: " + s1.calculateAverage());
		
		System.out.println();
		
		Teacher t1 =  new Teacher("Shorubiga", "Object oriented design and Programming");
		
		System.out.println("Name of the Teacher: " + t1.getName());
		System.out.println("Role of the Teacher: " + t1.getRole());
		System.out.println("Subject of the Teacher: " + t1.getSubject());
	}
}