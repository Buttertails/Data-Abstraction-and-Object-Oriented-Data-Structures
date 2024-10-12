/*
 * Write a Java Program to let the user enter three words, and then find the longest
 * common prefix string.
 * Example:
 * input three words “flower”, “flow”, “flight”
 * Output: “fl”
 * Input three words: “dog”, “racecar”, “car”
 * Output: “”
 */
package week1;

import java.util.Scanner;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first, second, third, prefix = "";
		int length;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three words: ");
		first = input.next();
		second = input.next();
		third = input.next();
		
		input.close();
		
		length = first.length() < second.length() ? first.length() : second.length();
		length = length < third.length() ? length : third.length();

		for(int index = 0; index < length; index++)
		{
			if(first.charAt(index) == second.charAt(index) && second.charAt(index) == third.charAt(index))
				prefix += first.charAt(index);
		}
		
		System.out.println("Common Prefix: " + prefix);
	}

}
