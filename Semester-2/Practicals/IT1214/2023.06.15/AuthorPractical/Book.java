class Book {
	private String name;
	private double price;
	private int quantity;
	private Author author = new Author("Jallu","zzzahrannnldeen@gmail.com",'M');
	
	public Book(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public String toString(){
		return ("Book Name: "+this.name+"\n"+"Price: "+this.price+"\n"+"Author Name: "+author.getName()+"\n"+"Author Email: "+author.getEmail()+"\n"+"Author Gender: "+author.getGender());
	}
}