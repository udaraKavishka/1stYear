abstract class Bike{
	abstract void run();
	
	void printColor(){
		System.out.println("Black");
	}
}
class Honda extends Bike{
	void run(){  //implementing
		System.out.println("Running Honda!");
	}
	void printColor(){ //overriding
		System.out.println("White");
	}
}
class Main{
	public static void main(String args[]){
		Honda h = new Honda();
		h.printColor();
		h.run();
	}
}