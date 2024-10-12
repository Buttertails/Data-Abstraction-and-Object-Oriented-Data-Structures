package codingPractice1;

import java.util.Scanner;

public class DisplayInteger {
	
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 4 digit integer: ");
        num = input.nextInt();
        
        input.close();

        System.out.println(num / 1000);
        num %= 1000;
        System.out.println(num  / 100);
        num %= 100;
        System.out.println(num / 10);
        num %= 10;
        System.out.println(num);
        
    }
}
