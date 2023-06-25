/* Create an interface Calculator1
which has following abstract methods.
add(int x, int y): int
sub(int x, int y): int
mul(int x, int y): int
div(int x, int y): double
findMax(int x, int y):int
isEven(int x): boolean

Create a class Math1 
which implements Calculator1. */

interface Calculator1{
	public int add(int x, int y);
	public int sub(int x, int y);
	public int mul(int x, int y);
	public double div(int x, int y);
	public int findMax(int x, int y);
	public boolean isEven(int x);
}


