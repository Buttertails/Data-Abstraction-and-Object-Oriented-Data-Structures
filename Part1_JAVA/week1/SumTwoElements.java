/*
 * Author: Drew Elliott
 * Write a Java program to create an int array and initialize it with some values. Then
 * ask the user to enter an integer as the target, and then display the indices of the two
 * elements such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not
 * use the same element twice.
 * Example:
 * Array: { 2, 7, 11, 15}, target = 9
 * Output: 0, 1
*/

package week1;

import java.util.Scanner;

public class SumTwoElements {

	public static void main(String[] args) {

		final int MAX_NUMS = 4;
		int[] nums = new int[]{2, 7, 11, 15};
		int i, j, target;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for the target value: ");
		target = input.nextInt();
		
		for(i = 0; i < MAX_NUMS - 1; i++)
		{
			for(j = i + 1; j < MAX_NUMS - j; j++)
			{
				if(nums[i] + nums[j] == target)
				{
					System.out.println("Output: " + i + ", " + j);
				}
			}
		}
	}
}
