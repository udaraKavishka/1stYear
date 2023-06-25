class Employee{

private String Employee_Name;
private int age;
static int employee_Count;


public void setEmployeeName(String name){
this.Employee_Name=name;
}

public void setAge(int age){
this.age=age;
}

public String getEmployeeName(){
	return Employee_Name;
}

public int getAge(){
	return age;
}

public int getEmployeeCount(){
 return employee_Count;
}

//constrctors

public Employee(){  //defualt one
 employee_Count++;
 this.Employee_Name="";
 this.age=0;
}

public Employee(String empName,int age){
employee_Count++;
 this.Employee_Name=empName;
 this.age=age;

}
}