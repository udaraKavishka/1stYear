/*
	Date: 12.06.2023
	Practical Number: 86
	Problem Specification: Create an Employee class
							Private attributes : name, role
							Method calculateSalary() : double
							Create Manager subclass with private attributes basicSalary, bonus
							Create HR subclass with private attributes basicSalary, bonus
*/

class Employee{
	private String name;
	private String role;
	
	public Employee(String name, String role){
		this.name = name;
		this.role = role;
	}
	
	public double calculateSalary(){
		return 0.0;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setRole(String role){
		this.role = role;
	}
}

class Manager extends Employee{
	private double basicSalary;
	private double bonus;
	
	public Manager(String name, String role, double basicSalary, double bonus){
		
		//initialize  the constructor using super
		super(name, "Manager");
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	}
	
	public double calculateSalary(){
		return basicSalary + bonus;
	}
}

class HR extends Employee{
	private double basicSalary;
	private double bonus;
	
	public HR(String name, String role, double basicSalary, double bonus){
		
		//initialize  the constructor using super
		super(name, "HR");
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	}
	
	public double calculateSalary(){
		return basicSalary + bonus;
	}
}

public class JavaEx86{
	public static void main(String[] args){
		
		Manager mn1 = new Manager("Somasiri", "Manager", 500000.00, 10000.0);
		
		double managerSalary = mn1.calculateSalary();
			System.out.println("Manager's salary: Rs. " + managerSalary);
		
		HR hr1 = new HR("Jayasiri", "HR", 400000.00, 5000.00);
		
		double hrSalary = hr1.calculateSalary();
			System.out.println("HR's salary: Rs. " + hrSalary);
	}
}