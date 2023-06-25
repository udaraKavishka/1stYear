/*
	Date: 29.05.2023
	Practical Number: 84
	Problem Specification: Create object obj2 by passing age and name as argument to the coonstructor
							print the name and age of obj2set the name and age of obj2
							Set the name and age of obj2 as "Elon", 58
							print the name and age of obj2
*/

class Person{
	private String name;
	private int age;
	
	
	public String getname(){
		return name;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int getage(){
		return age;
	}
}

class PersonApp{
	public static void main(String[] args){
		Person obj1 =  new Person("Elon", 58);
			System.out.println("The name is: " + obj2.getname());
			System.out.println("The age is: " + obj2.getage());
	}
}