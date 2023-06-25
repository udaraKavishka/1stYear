/*
	Consider a scenario where you are developing a Hospital Management System. 
	Implement the following classes using encapsulation, inheritance, and a 2D array to fulfill the requirements:

	Create a class called Employee with the following attributes:

	name (String): to store the employee's name.
	salary (double): to store the employee's salary.
	Provide appropriate getter and setter methods to access and modify the attributes.
	Create a subclass called Doctor that inherits from the Employee class. 

	The Doctor class should have an additional attribute:
	specialization (String): to store the doctor's specialization.
	Provide appropriate getter and setter methods to access and modify the attribute.

	Create a subclass called Nurse that also inherits from the Employee class. The Nurse class should have an additional attribute:
	shift (String): to store the nurse's shift (e.g., "Day" or "Night").
	Provide appropriate getter and setter methods to access and modify the attribute.

	Create a class called Hospital with the following attributes:
	employees (2D array of Employees): to store the employees in the hospital.
	Provide appropriate methods to add employees to the hospital, display all employees' details, and calculate the total salary expenditure of the hospital.
	Write the Java code to implement the above requirements.
*/

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

class Nurse extends Employee {
    private String shift;

    public Nurse(String name, double salary, String shift) {
        super(name, salary);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}

class Hospital {
    private Employee[][] employees;
    private int totalEmployees;

    public Hospital(int maxDepartments, int maxEmployeesPerDepartment) {
        employees = new Employee[maxDepartments][maxEmployeesPerDepartment];
        totalEmployees = 0;
    }

    public void addEmployee(Employee employee, int department) {
        int numEmployees = employees[department].length;
        if (totalEmployees < numEmployees) {
            employees[department][totalEmployees] = employee;
            totalEmployees++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Department is full. Cannot add more employees.");
        }
    }

    public void displayEmployees() {
        System.out.println("Employees in the hospital:");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Department " + (i + 1) + ":");
            for (int j = 0; j < employees[i].length; j++) {
                if (employees[i][j] != null) {
                    Employee employee = employees[i][j];
                    System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
                }
            }
            System.out.println();
        }
    }

    public double calculateTotalSalaryExpenditure() {
        double totalSalary = 0.0;

        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                if (employees[i][j] != null) {
                    totalSalary += employees[i][j].getSalary();
                }
            }
        }

        return totalSalary;
    }
}

public class JavaEx92 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(2, 5);

        Doctor doctor1 = new Doctor("John Doe", 8000.0, "Cardiology");
        Doctor doctor2 = new Doctor("Jane Smith", 9000.0, "Pediatrics");
        Nurse nurse1 = new Nurse("Emily Johnson", 4000.0, "Day");
        Nurse nurse2 = new Nurse("David Williams", 4000.0, "Night");

        hospital.addEmployee(doctor1, 0);
        hospital.addEmployee(doctor2, 0);
        hospital.addEmployee(nurse1, 1);
        hospital.addEmployee(nurse2, 1);

        hospital.displayEmployees();

        double totalSalaryExpenditure = hospital.calculateTotalSalaryExpenditure();
        System.out.println("Total Salary Expenditure: $" + totalSalaryExpenditure);
    }
}