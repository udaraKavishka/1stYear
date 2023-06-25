/*
	Date:
	Practical Number: 10
	Problem Specification: Using java operators
*/

class JavaEx10{

	public static void main(String args[]){

		//Assignment operators[=, /=, -=, +=, *=]
		int a = 10;
		System.out.println("The value of a is: "+ a);

		int b = a;
		System.out.println("The value of b is: "+ b);

		int c = 3;
		c += a;
		System.out.println("The value of c is: "+ c);

		c %= 5;
		System.out.println("The value of c is: "+ c);

		c *= 4;
		System.out.println("The value of c is: "+ c);
		
		System.out.println();

		//Relational operators[ ==, >, <, >=, <=, !=]
		int x = 90;
		int y = 64;
			System.out.println("x == y : "+ (x==y));
			System.out.println("x > y : "+ (x>y));
			System.out.println("x < y : "+ (x<y));
			System.out.println("x >= 20 : "+ (x>=20));
			System.out.println("x <= 70 : "+ (x<=70));
			System.out.println("x != 64 : "+ (x!=64));

		System.out.println();
		
		//Logical operators[&&, ||, !]
		int p = 3;
		int q = 5;
			System.out.println("( p>q ) && ( p==q ) : "+ ((x > y)&&(x == y)));
			System.out.println("( p<=3 ) && ( p>=5 ) : "+ ((x <= 3)&&(x >= 5)));
			System.out.println("( p>3 ) || ( p<5 ) : "+ ((x > 3)||(x < 5)));
			System.out.println("!( p==3 ) && ( p== 5) : "+ (!(x == 3)&&(x == 5)));
			System.out.println("p++ : "+ p++);
			System.out.println("p : "+ p);
			System.out.println("++q : "+ ++q);
			System.out.println("q : "+ q);	
	} 
}