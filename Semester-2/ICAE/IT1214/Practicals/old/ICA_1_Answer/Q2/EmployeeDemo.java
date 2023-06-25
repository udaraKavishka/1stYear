class EmployeeDemo{

	public static void main(String[] args) {
		//create objects for Empolyee
		Employee obj1=new Employee();  //this is defualt one
		Employee obj2=new Employee("Viraj",22);

		System.out.println("Frist employee age :"+obj1.getAge()); //call defualt constrctor
		System.out.println("Second employee age :"+obj2.getAge());

		System.out.println("Employee Count is : "+Employee.employee_Count);

	}
}