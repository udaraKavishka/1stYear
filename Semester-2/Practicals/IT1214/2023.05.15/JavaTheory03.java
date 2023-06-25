class JavaTheory03{
	public static void main(String[] args){
		
		//Declare and instantiate a 2D array
		double ARRAY_MARKS[][] = new double[][];
		
		//Initialize
		double SALARY[][] = {
			{5000.00, 680.43, 567, 98},
			{456.0, 654, 98, 10000, 234, 7},
			{32.0, 78.9,976.5},
			{900, 10000, }
		};
		for(int i=0; i<SALARY.length; i++){
			for(int j=0; j<SALARY[i].length; j++){
				System.out.println("The element at [" + i + "][" + j + "]")
			}
		}
	}
}