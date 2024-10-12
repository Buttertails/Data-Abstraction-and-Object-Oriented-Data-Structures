/**
 * This program takes a time in a 24-hour format and 
 * converts it into a 12-hour format
 * @author Drew Elliott
 */
package week5;

import java.util.Scanner;

public class Time2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 24-hour time in the format (hh:mm): ");
		try
		{
			System.out.println("12-hour time: " + to12(input.nextLine()));
		}
		catch(HourOutOfBoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(MinuteOutOfBoundException e)
		{
			System.out.println(e.getMessage());
		}
		input.close();
	}
	
	/**
	 * Converts 24-hour time to 12-hour time
	 * @param time a time in 24-hour format
	 * @return a time in 12-hour format
	 */
	public static String to12(String time) throws HourOutOfBoundException, MinuteOutOfBoundException
	{
		String[] words = time.split(":");				//Holds the hour and minute values of the time
		int hour = Integer.parseInt(words[0]);			//Converts the hour value to an int 
		int minute = Integer.parseInt(words[1]);		//Converts the minute value to an int
		
		String s, s2;									//s holds the 12-hour formatted time that is returned
														//s2 holds either AM or PM depending on the time
		
		if(!(hour >= 0 && hour <= 23))
			throw new HourOutOfBoundException("ERROR: Not a proper hour");
		
		if(hour > 12)
		{
			hour -= 12;
			s2 = "PM";
		}
		else
			s2 = "AM";
		
		s = (hour + ":" + minute + " " + s2);
		return s;
		
		//Throws an error if the entered time is invalid
		/*
		try
		{
			if(!(hour >= 0 && hour <= 23))
				throw new HourOutOfBoundException("ERROR: Not a proper hour");
			if(!(minute >= 0 && minute <= 59))
				throw new MinuteOutOfBoundException("ERROR: Not a proper minute");
			//If the hour is greater than 12 then calculate the 12-hour time
			if(hour > 12)
			{
				hour -= 12;
				s2 = "PM";
			}
			else
				s2 = "AM";
			
			s = (hour + ":" + minute + " " + s2);
			return s;
		}
		catch(HourOutOfBoundException e)
		{
			return e.getMessage();
		}
		catch(MinuteOutOfBoundException e)
		{
			return e.getMessage();
		}
		*/
		
	}

}
