/*
	Date: 29.05.2023
	Practical Number: 83
	Problem Specification: Create a class Person
							private attributes name, age
							print the name and age of the Person
							Create the class PersonApp
							Assign value to name and age for a person object
*/

class Person{
	private String name;
	private int age;
	
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public int getage(){
		return age;
	}
	
	public void setage(int age){
		this.age = age;
	}
}

class PersonApp{
	public static void main(String[] args){
		Person obj1 =  new Person();
		obj1.setname("Pakaya");
		obj1setage(21);
		
			System.out.println("The name is: " + obj.getname());
			System.out.println("The age is: " + obj.getage());
	}
}