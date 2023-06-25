/*
	Date: 15.06.2023
	Practical Number: 88
	Problem Specification: 
*/

import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

class Author{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public void printDetails(){
		System.out.println("Author's name: " + name);
		System.out.println("Author's email: " + email);
		System.out.println("Author's gender: " + gender);
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public char getGender(){
		return this.gender;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
}

class Book{
	private String name;
	private double price;
	private int quantity;
	private Author author;
	
	public Book(String name, double price, int quantity, Author author){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.author = author;
	}
	
	public String toString(){
		return "Book name: " + name +
				"\nPrice: " + price +
				"\nAuthor's name: " + author.getName() +
				"\nAuthor's email: " + author.getEmail() +
				"\nAuthor's gender: " + author.getGender();
	}
	
	public boolean isAvailable(int requestedQuantity){
		return quantity > 0 && quantity >= requestedQuantity;
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
	
	public int getAuthor(){
		return this.author;
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
	
	public void setAuthor(int author){
		this.author = author;
	}
}

class BookMain{
	public static void main(String[] args){
		initializeBooks();
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the book: ");
		String bookName = sc.nextLine();
			System.out.println("Enter the required quantity: ");
		int requestedQuantity = sc.nextInt();
		
		boolean found = false;
		
		for(Book book : books){
			if(book.getName().equalsIgnoreCase(bookName)){
				found = true;
				if(book.isAvailable(requestedQuantity)){
					System.out.println("Available!");
					System.out.println(book.toString());
				}
				else{
					System.out.println("Request not available!");
					System.out.println(book.toString());
				}
				break;
			}
		}
		if(!found){
			System.out.println("Out of stock!");
		}
	}
	
	private static void initializeBooks(){
		books = new ArrayList<>();
		
		Author A1 = new Author("Kathy Sierra", "kathysierra@gmail.com", 'M');
		Author A2 = new Author("Walter Savitch", "waltersavitch@gmail.com", 'M');
		Author A3 = new Author("Herbert Schildt", "herbertschildt@gmail.com", 'M');
		Author A4 = new Author("Cay S. Hortsmann", "cayhortsmann@gmail.com", 'F');
		Author A5 = new Author("Craig Walls", "craigwalls@yahoo.com", 'M');
		Author A6 = new Author("M. G. Martin", "mgmartin@gmail.com", 'M');
		Author A7 = new Author("Y. Daniel Liang", "danielliang@live.com", 'M');
		Author A8 = new Author("Nathan Clark", "nathanclark@gmail.com", 'F');
		
		books.add(new Book("Head first Java", 5360.00, 5, A1));
		books.add(new Book("Java: Introduction to problem solving", 4300.00, 8, A2));
		books.add(new Book("Java: Beginner's guide", 3874.00, 8, A3));
		books.add(new Book("Core Java", 3874.00, 5, A4));
		books.add(new Book("Core Java SE9", 5170.00, 10, A4));
		books.add(new Book("OCA/OCP Java SE7", 4330.00, 0, A1));
		books.add(new Book("Spring in Action", 5440.00, 6, A5));
		books.add(new Book("Java: Basics for beginners", 980.00, 4, A6));
		books.add(new Book("Intro to Java programming", 2500.00, 3, A7));
		books.add(new Book("Java: Programming basics", 500.00, 7, A8));
	}
}