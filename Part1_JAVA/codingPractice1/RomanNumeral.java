package codingPractice1;

import java.util.Scanner;

public class RomanNumeral {
	public static void main(String[] args) {
		int num = 0;
		String s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a roman numeral: ");
		s = input.next();
		
		input.close();
		
	    for(int i = 0; i < s.length(); i++)
	    {
	        if(i < s.length() - 1  && s.charAt(i) == 'X' && s.charAt(i+1) == 'L')
	        {
	            num += 40;
	            i++;
	            continue;
	        }
	        else if(i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C')
	        {
	            num += 90;
	            i++;
	            continue;
	        }
	        else if(i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D')
	        {
	            num += 400;
	            i++;
	            continue;
	        }
	        else if(i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M')
	        {
	            num += 900;
	            i++;
	            continue;
	        }
	        else if(i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V')
	        {
	            num += 4;
	            i++;
	            continue;
	        }
	        else if(i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X')
	        {
	            num += 9;
	            i++;
	            continue;
	        }
	        else if(i > 0 && s.charAt(i) == 'M' && s.charAt(i-1) != 'C')
	        {
	            num += 1000;
	            continue;
	        }
	        else if(i > 0 && s.charAt(i) == 'D' && s.charAt(i-1) != 'C')
	        {
	            num += 500;
	            continue;
	        }
	        else if(i > 0 && s.charAt(i) == 'C' && s.charAt(i-1) != 'X')
	        {
	            num += 100;
	            continue;
	        }
	        else if(i > 0 && s.charAt(i) == 'L' && s.charAt(i-1) != 'X')
	        {
	            num += 50;
	            continue;
	        }
	        else if(i > 0 && s.charAt(i) == 'X' && s.charAt(i-1) != 'I')
	        {
	            num += 10;
	            continue;
	        }
	        else if(i > 0 && s.charAt(i) == 'V' && s.charAt(i-1) != 'I')
	        {
	            num += 5;
	            continue;
	        }
	         else if(s.charAt(i) == 'M')
	        {
	            num += 1000;
	            continue;
	        }
	        else if(s.charAt(i) == 'D')
	        {
	            num += 500;
	            continue;
	        }
	        else if(s.charAt(i) == 'C')
	        {
	            num += 100;
	            continue;
	        }
	        else if(s.charAt(i) == 'L')
	        {
	            num += 50;
	            continue;
	        }
	        else if(s.charAt(i) == 'X')
	        {
	            num += 10;
	            continue;
	        }
	        else if(s.charAt(i) == 'V')
	        {
	            num += 5;
	            continue;
	        }
	        else if(s.charAt(i) == 'I')
	        {
	            num += 1;
	            continue;
	        }
	    }
	    
	    System.out.println("Converted Roman Numeral: " + num);
	}
}