package bank;

public class BankAccount {
	private String ID;
	private String name;
	private	double balance;
	private static double interestRate;
	private static int numAccounts = 0;
	
	public BankAccount(String ID, String name, double balance)
	{
		this.ID = ID;
		this.name = name;
		this.balance = balance;
		numAccounts++;
	}
	
	public BankAccount()
	{
		this.ID = "";
		this.name = "";
		this.balance = 0;	
	}
	
	public String getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getInterest()
	{
		return interestRate;
	}
	
	public static int getNumAccounts()
	{
		return numAccounts;
	}
	
	public void withdraw(double amount)
	{
		if(amount > balance)
			System.out.println("WITHDRAWAL AMOUNT GREATER THAN BALANCE");
		else
		{
			balance -= amount;
			System.out.println("Withdrawal Successful");
		}
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposit Successful");
	}
	
	public static void setInterestRate(double rate)
	{
		interestRate = rate;
	}
	
	public void displayInfo()
	{
		System.out.println("\nAccount ID: " + ID);
		System.out.println("Customer Name: " + name);
		System.out.println("Balance: " + balance);
	}
}
