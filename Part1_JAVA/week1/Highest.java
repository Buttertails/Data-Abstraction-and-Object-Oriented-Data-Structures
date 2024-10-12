package week1;

import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUMS = 10;
		
		int highest, second;
		int[] nums = new int[MAX_NUMS];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter 10 numbers: ");
		
		for(int i = 0; i < MAX_NUMS; i++)
		{
			nums[i] = input.nextInt();
		}
		
		highest = nums[0];
		
		for(int i = 1; i < MAX_NUMS; i++)
		{
			if(highest < nums[i])
			{
				highest = nums[i];
			}
		}
		
		second = nums[0];
		
		for(int i = 1; i < MAX_NUMS; i++)
		{
			if(nums[i] < highest && nums[i] > second)
			{
				second = nums[i];
			}
		}
		
		System.out.println("Highest Number: " + highest);
		System.out.println("Second Highest Number: " + second);
		
		input.close();
	}
}
