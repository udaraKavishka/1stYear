import java.util.Scanner;
class MathApp{
	public static void main(String args[]){
		//Get x, y from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x=sc.nextInt();
		System.out.println("Enter y: ");
		int y=sc.nextInt();
		//Create an object for Math1
		Math1 math1 = new Math1();
		//print sum,sub,mul,div,findMax of x,y
		System.out.println(x+" + "+y+" : "+math1.add(x,y));
		System.out.println(x+" - "+y+" : "+math1.sub(x,y));
		System.out.println(x+" * "+y+" : "+math1.mul(x,y));
		System.out.println(x+" / "+y+" : "+math1.div(x,y));
		System.out.println("Maximum is: "+math1.findMax(x,y));
		//print y isEven()
		if(math1.isEven(y))
			System.out.println(y+" is Even");
		else
			System.out.println(y+" is Odd");
		//Get z as user input.
		int z=sc.nextInt();
		System.out.println("Enter z: ");
		//Create an object of Math2
		Math2 math2 = new Math2();
		//print sum,sub,mul,div,findMax of x,y
		System.out.println(x+" + "+y+" : "+math2.add(x,y));
		System.out.println(x+" - "+y+" : "+math2.sub(x,y));
		System.out.println(x+" * "+y+" : "+math2.mul(x,y));
		System.out.println(x+" / "+y+" : "+math2.div(x,y));
		System.out.println("Maximum is: "+math2.findMax(x,y));
		//print z isEven()
		if(math1.isEven(z))
			System.out.println(z+" is Even");
		else
			System.out.println(z+" is Odd");
		//print average of x,z and x,y,z
		System.out.println("Average of "+x+" & "+z+" : "+math2.findAverage(z,y)); //m1
		System.out.println("Average of "+x+" & "+y+" & "+z+" : "+math2.findAverage(x,y)); //m1
		System.out.println("Average of "+x+" & "+y+" & "+z+" : "+math2.findAverage(x,y,z)); //m2
	}
}
/* Create an interface Calculator2
which has following methods.
findAverage(double x, double y):double
findAverage(double x, double y, double z):double 

Create a class Math2 
which implements Calculator1, Calculator2.*/



Create an interface Calculator3 
which extends Calculator1.
which has following abstract method.
findSum(int x, int y, int z):double