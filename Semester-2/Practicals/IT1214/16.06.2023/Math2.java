class Math2 implements Calculator1, Calculator2{
	public int add(int x, int y){
		return x+y;
	}
	public int sub(int x, int y){
		return x-y;
	}
	public int mul(int x, int y){
		return x*y;
	}
	public double div(int x, int y){
		return x/y;
	}
	public int findMax(int x, int y){
		if(x>y)
			return x;
		else 
			return y;
	}
	public boolean isEven(int x){
		return (x%2==0);
	}
	public double findAverage(double x, double y){
		return (x+y)/2;
	}
	public double findAverage(double x, double y, double z){
		return (x+y+z)/3;
	}
}