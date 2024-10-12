/*
 * Write a program to let the user enter a word, and then a
 * sentence. Display both the word and the sentence first. Then
 * check if the sentence contains that word.
 */

package week2;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word and then enter a sentence: ");
		String word = input.next();
		String sentence = input.nextLine();
		
		input.close();
		
		System.out.println("Word: " + word);
		System.out.println("Sentence: " + sentence.trim());
		
		if(sentence.contains(word))
			System.out.println("Sentence contains word: True");
		else
			System.out.println("Sentence contains word: False");
	}

}
