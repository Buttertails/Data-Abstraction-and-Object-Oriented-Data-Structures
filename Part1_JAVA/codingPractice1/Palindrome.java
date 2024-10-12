package codingPractice1;

import java.util.Scanner;
	
public class Palindrome {

	public static void main(String[] args) {
		{	
			int i = 0, j;
			boolean check = false;
			String s, s2;
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a string: ");
			s = input.nextLine();
			
			input.close();
			
			s2 = s.replaceAll("\\s", "");

			j = s2.length() - 1;
			
			while(i <= j)
			{
				if(s2.charAt(i) == s2.charAt(j))
					check = true;
				else
				{
					check = false;
					break;
				}
				
				i++;
				j--;		
			}
			
			if(check)
				System.out.println(s + " is a palindrome");
			else
				System.out.println(s + " is NOT a palindrome");
		}

	}

}
