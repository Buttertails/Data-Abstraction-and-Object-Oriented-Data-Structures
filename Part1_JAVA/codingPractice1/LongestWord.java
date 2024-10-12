/*
 * Write a method that receive a string inside which is a sentence, then return
the longest word from the sentence.
You can assume the sentence only contains letters and space.
*/
package codingPractice1;

import java.util.Scanner;

public class LongestWord
{
	public static void main(String[] args)
	{
		String s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		s = input.nextLine();
		
		input.close();

		System.out.println("Longest Word: " + longest(s));
	}
	
	public static String longest(String s)
	{
		String longest;
		String[] words;
		words = s.split("\\s");
		
		longest = words[0];
		
		for(int i = 0; i < words.length; i++)
		{
			if(longest.length() < words[i].length())
				longest = words[i];
		}
		
		return longest;
	}
}
