// This is a basic program on Java
//
// Try to modify and run it and check out
// the output in the terminal below
//
// Happy coding! :-)
package codingPractice1;

import java.util.Scanner;

public class ReverseString {
	
    public static void main(String[] args){
        String s;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        s = input.nextLine();

        input.close();

        System.out.print("Reverse: ");
        for(int i = s.length() - 1; i > -1; i--)
            System.out.print(s.charAt(i));
        System.out.println();
    }
}