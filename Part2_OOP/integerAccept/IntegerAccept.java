package integerAccept;

import java.util.Scanner;

public class IntegerAccept {
	private int min;
	private int max;
	private int value;
	private String prompt = "Enter a value: ";
	
	public IntegerAccept(int min, int max)
	{
		this.min = min;
		this.max = max;
	}
	
	public IntegerAccept()
	{
		this.min = 0;
		this.max = 0;
	}
	
	public int getValue()
	{
		Scanner input = new Scanner(System.in);
		System.out.print(prompt);
		value = input.nextInt();
		input.nextLine();
		
		while(!(value >= min && value <= max))
		{
			System.out.println("ERROR: OUTSIDE RANGE");
			System.out.print(prompt);
			value = input.nextInt();
			input.nextLine();
		}
		
		return value;
	}
	
	public void setMin(int min)
	{
		this.min = min;
	}
	
	public void setMax(int max)
	{
		this.max = max;
	}
	
	public int getMin()
	{
		return min;
	}
	
	public int getMax()
	{
		return max;
	}
}
