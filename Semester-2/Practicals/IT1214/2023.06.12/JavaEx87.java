/*
	Date: 12.06.2023
	Practical Number: 87
	Problem Specification: Create a class BankAccount
							private attributes : accountNo, balance
							method : deposit(), withdraw
							create a subclass SavingsAccount
							which overrides withdraw() to maintain minimum balance Rs. 500.00
*/

class BankAccount{
	private String accountNo;
	private double balance;
	
	public BankAccount(String accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public void deposit(double newBalance){
		balance += newBalance;
		System.out.println("Your deposited ammount is: Rs. " + newBalance);
	}
	
	public void withdraw(double newBalance){
		if(newBalance <= balance){
			balance -= newBalance;
				System.out.println("Your withdrawen ammount is: Rs. " + newBalance);
		}
		else{
			System.out.println("Insufficient account balance");
		}
	}
	
	public double getBalance(){
		return balance;
	}
}

class SavingsAccount extends BankAccount{
	private static final double minBalance = 500.00;
	
	public SavingsAccount(String accountNo, double balance){
		super(accountNo, balance);
	}
	
	public void withdraw(double newBalance){
		if(getBalance() - newBalance >= minBalance){
			super.withdraw(newBalance);
		}
		else{
			System.out.println("Withdrwal ammount is not in account balance capacity.");
		}
	}
}

public class JavaEx87{
	public static void main(String[] args){
		
		BankAccount ba1 = new BankAccount("11223344", 1000.00);
			ba1.deposit(500.00);
			ba1.withdraw(300.00);
				System.out.println("Account balance is: Rs. " + ba1.getBalance());
		
		SavingsAccount sa1 = new SavingsAccount("99887766", 1000.00);
			sa1.deposit(500.00);
			sa1.withdraw(300.00);
				System.out.println("Account balance is: Rs " + sa1.getBalance());
	}
}