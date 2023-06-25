/*
	Date: 12.06.2023
	Practical Number: 85
	Problem Specification: Create a class Animal with method makeSound()
							Create a subclass cat of Animal which overrides the method makeSound()
*/

class Animal{
	public void makeSound(){
		System.out.println("The animal");
	}
}

class Cat extends Animal{
	public void makeSound(){
		System.out.println("Cat is an animal");
	}
}

public class JavaEx85{
	public static void main(String[] args){
		Animal ob1 = new Animal();
		ob1.makeSound();
		
		Cat ob2 = new Cat();
		ob2.makeSound();
	}
}