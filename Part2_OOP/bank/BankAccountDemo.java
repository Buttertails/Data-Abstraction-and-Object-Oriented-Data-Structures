package bank;

import java.util.Scanner;

public class BankAccountDemo {

	public static void main(String[] args) {
		final int NUM_CUSTOMERS = 100;
		Scanner input = new Scanner(System.in);
		BankAccount[] accounts = new BankAccount[NUM_CUSTOMERS];
		int choice = 1, index, index2;
		String name, ID, ID2;
		double amount, sum = 0;
		
		while(choice != 0)
		{
			System.out.println();
			displayMenu();
			choice = input.nextInt();
			input.nextLine();
			System.out.println();
			
			switch(choice)
			{
			case (0):
				break;
			case (1):
				System.out.print("Enter name: ");
				name = input.nextLine();
				System.out.print("Enter ID: ");
				ID = input.nextLine();
				System.out.print("Enter balance: ");
				amount = input.nextDouble();
				
				accounts[BankAccount.getNumAccounts()] = new BankAccount(ID, name, amount);
				System.out.println("Account created");
				break;
			case (2):
				System.out.print("Enter ID of account to withdraw: ");
				ID = input.nextLine();
				System.out.print("Amount to withdraw: ");
				amount = input.nextDouble();
				
				index = findAccount(ID, accounts);
				
				if(amount > accounts[index].getBalance())
					System.out.println("Insufficient funds");
				
				if(index == -1)
					System.out.println("Account was not found");
				else
					accounts[index].withdraw(amount);
				break;
			case (3):
				System.out.print("Enter ID of account to deposit: ");
				ID = input.nextLine();
				System.out.print("Amount to deposit: ");
				amount = input.nextDouble();
				
				index = findAccount(ID, accounts);
				
				if(index == -1)
					System.out.println("Account was not found");
				else
					accounts[index].deposit(amount);
				break;
			case (4):
				System.out.print("Enter ID of account to transfer from: ");
				ID = input.nextLine();
				System.out.print("Enter ID of account to transfer to: ");
				ID2 = input.nextLine();
				
				index = findAccount(ID, accounts);
				index2 = findAccount(ID2, accounts);
				
				if(index == -1 || index2 == -1)
					System.out.println("One or both Accounts was not found");
				else
				{
					System.out.print("Enter the amount to transfer: ");
					amount = input.nextDouble();
					
					accounts[index].withdraw(amount);
					accounts[index2].deposit(amount);
					
					System.out.println("Transfer successful");
				}
				break;
			case (5):
				System.out.print("Enter ID of account to check balance: ");
				ID = input.nextLine();
				
				index = findAccount(ID, accounts);
				
				if(index == -1)
					System.out.println("Account was not found");
				else
					System.out.println("Current Balance: " + accounts[index].getBalance());
				break;
			case (6):
				System.out.print("Enter new interest rate: ");
				amount = input.nextDouble();
				BankAccount.setInterestRate(amount);
				break;
			case (7):
				System.out.println("Total Number of Accounts: " + BankAccount.getNumAccounts());
				break;
			case (8):
				for(int i = 0; i < BankAccount.getNumAccounts(); i++)
					sum += accounts[i].getBalance();
				System.out.println("Total balance across all acounts: " + sum);
				break;
			case (9):
				System.out.print("Enter ID of account to display: ");
				ID = input.nextLine();
				
				index = findAccount(ID, accounts);
				
				if(index == -1)
					System.out.println("Account was not found");
				else
					accounts[index].displayInfo();
				break;
			}
		}
		input.close();
		System.out.println("Goodbye");
	}
	
	public static void displayMenu()
	{
		System.out.println("1. Open a new account");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Transfer");
		System.out.println("5. Check balance");
		System.out.println("6. Update interest rate");
		System.out.println("7. Check total number of accounts");
		System.out.println("8. Check total balance across all accounts");
		System.out.println("9. Display account information");
		System.out.println("0. Quit");
		System.out.print("Selection: ");
	}
	
	public static int findAccount(String id, BankAccount[] ac)
	{
		for(int i = 0; i < BankAccount.getNumAccounts(); i++)
		{
			if(ac[i].getID().equals(id))
			{
				return i;
			}
		}
		
		return -1;
	}
}
