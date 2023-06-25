class Employee{
	private String name;
	private double salary;
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
        this.salary = salary;
    }
}

class Doctor extends Employee{
	private String specialization;
	
	
}

class Nurse extends Employee{

}

public class Hospital{
	public static void main(String[] args){
		
		
	}
}