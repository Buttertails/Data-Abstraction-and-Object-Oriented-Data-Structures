package date;

import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {
		int year, month, day, days, weeks;
		
		Scanner input = new Scanner(System.in);
		
		// Tests the getters of the Date class
		System.out.print("Enter a date in the format (year month day): ");
		year = input.nextInt();
		month = input.nextInt();
		day = input.nextInt();
		input.nextLine();
		
		Date date = new Date(year, month, day);
		
		// Tests the isLeapYear method of the Date class
		System.out.println("Is " + date.getYear() + " a leap year: " + date.isLeapYear());
		
		// Tests the addDays and toString methods of the Date class
		System.out.print("Number of days to add: ");
		days = input.nextInt();
		//input.nextLine();
		date.addDays(days);
		System.out.println("Date with " +  days + " days added: " + date.toString());
		
		// Tests the addWeeks and toString methods of the Date class
		System.out.print("Number of weeks to add: ");
		weeks = input.nextInt();
		input.nextLine();
		date.addWeeks(weeks);
		System.out.println("Date with " + weeks + " weeks added: " + date.toString());
		
		// Tests the daysTo method of the Date class
		System.out.print("Enter a date in the format (year month day): ");
		year = input.nextInt();
		month = input.nextInt();
		day = input.nextInt();
		input.nextLine();
		Date date2 = new Date(year, month, day);
		System.out.println("Days to date 2: " + date.daysTo(date2));
		
		input.close();
	}

}
