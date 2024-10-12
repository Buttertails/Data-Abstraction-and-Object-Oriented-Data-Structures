package codingPractice1;

public class SavingsAccount {

	public static void main(String[] args) {
		final double INTEREST_RATE = 0.065;
		final int NUM_YEARS = 25;
		final int INITIAL_DEPOSIT = 10000;
		
		double balance = INITIAL_DEPOSIT, interest = 0;
		
		System.out.printf("%-10s", "Year");
		System.out.printf("%-20s", "Current Balance");
		System.out.printf("%-15s", "Interest");
		System.out.printf("%-10s\n", "New Balance");
		
		for(int i = 0; i < NUM_YEARS; i++)
		{
			System.out.printf("%-10d" + "%-20.2f", (i+1), balance);
			interest = balance * INTEREST_RATE;
			System.out.printf("%-15.2f", interest);
			balance += interest;
			System.out.printf("%-10.2f\n", balance);
		}
	}

}
