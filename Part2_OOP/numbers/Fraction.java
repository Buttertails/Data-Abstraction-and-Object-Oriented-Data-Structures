package numbers;

/**
 * Fraction class that holds the information about 
 * two fractions and can support addition and subtraction
 * @author Drew Elliott
 */
public class Fraction implements Number {
	private int num1;
	private int denom1;
	private int num2;
	private int denom2;
	private boolean sign1;
	private boolean sign2;
	
	/**
	 * Constructor
	 * @param num1		- value for the first numerator
	 * @param denom1	- value for the first denominator
	 * @param sign1		- sign for the first fraction
	 * @param num2		- value for the second numerator
	 * @param denom2	- value for the second denominator
	 * @param sign2		- sign for the second fraction
	 */
	public Fraction(int num1, int denom1, boolean sign1, int num2, int denom2, boolean sign2)
	{
		this.num1 = num1;
		this.denom1 = denom1;
		this.sign1 = sign1;
		this.num2 = num2;
		this.denom2 = denom2;
		this.sign2 = sign2;
	}
	
	/**
	 * Default Constructor
	 */
	public Fraction()
	{
		this(0, 0, false, 0, 0, false);
	}
	
	/**
	 * Adds the two fractions together by making sure they have 
	 * the same denominator, then add the numerators, then finally
	 * simplify the fraction by the gcd
	 */
	public void addition()
	{
		int gcd;
		int x;
		
		if(denom1 != denom2)
		{
			x = denom1;
			
			num1 *= denom2;
			denom1 *= denom2;
			
			num2 *= x;
			denom2 *= x;
		}
		
		if(sign1 == false)
			num1 *= -1;
		
		if(sign2 == false)
			num2 *= -1;
		
		num1 += num2;
		
		gcd = gcd(num1, denom1);
		
		if(gcd != 1)
		{
			num1 /= gcd;
			denom1 /= gcd;
		}
	}
	
	/**
	 * Subtracts the second fraction from the first fraction by making sure
	 * they have the same denominator, then subtract the second numerator from
	 * the first numerator, then finally simplify the fraction by the gcd
	 */
	public void subtraction()
	{
		int gcd;
		int x;
		
		if(denom1 != denom2)
		{
			x = denom1;
			
			num1 *= denom2;
			denom1 *= denom2;
			
			num2 *= x;
			denom2 *= x;
		}
		
		if(sign1 == false)
			num1 *= -1;
		
		if(sign2 == false)
			num2 *= -1;
		
		num1 -= num2;
		
		gcd = gcd(num1, denom1);
		
		if(gcd != 1)
		{
			num1 /= gcd;
			denom1 /= gcd;
		}
	}
	
	/**
	 * Calculates the greatest common divisor of two numbers
	 * Used for the subtraction and addition methods
	 * @param num1	- first number
	 * @param num2	- second number
	 * @return		- greatest common divisor of both numbers
	 */
	private int gcd(int num1, int num2)
	{
		int result;
		if(num1 % num2 == 0)
			result = num2;
		else
			result = gcd(num2, num1 % num2);
		return result;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getDenom1() {
		return denom1;
	}

	public void setDenom1(int denom1) {
		this.denom1 = denom1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getDenom2() {
		return denom2;
	}

	public void setDenom2(int denom2) {
		this.denom2 = denom2;
	}

	public boolean isSign1() {
		return sign1;
	}

	public void setSign1(boolean sign1) {
		this.sign1 = sign1;
	}

	public boolean isSign2() {
		return sign2;
	}

	public void setSign2(boolean sign2) {
		this.sign2 = sign2;
	}
	
	/**
	 * Display the first fraction
	 * Result of addition or subtraction
	 */
	public void display()
    {
        System.out.println(num1 + "/" + denom1);
    }

	@Override
	public String toString() {
		return "Fraction [num1=" + num1 + ", denom1=" + denom1 + ", num2=" + num2 + ", denom2=" + denom2 + ", sign1="
				+ sign1 + ", sign2=" + sign2 + "]";
	}

}
