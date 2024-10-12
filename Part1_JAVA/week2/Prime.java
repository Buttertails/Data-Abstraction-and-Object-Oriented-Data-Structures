/*
 * Develop a method isPrime() which take an integer and return
 * true if it is a prime, otherwise return false.
 * In the main method, invoke the isPrime() method with random
 * numbers and test if they are prime.
 */
package week2;

public class Prime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int COUNTER = 10;
		int num;	
		
		for(int i = 0; i < COUNTER; i++)
		{
			num = (int)(Math.random() * 101);
			if(isPrime(num))
				System.out.println(num + " is prime.");
			else
				System.out.println(num + " is not prime.");
		}
		
	}
	
	public static boolean isPrime(int x)
	{
		boolean result = true;
		
		for(int i = 2; i < x - 1; i++)
		{
			if(x % i == 0)
			{
				result = false;
			}
		}
		
		return result;
	}

}
