package date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
	private int year, month, day;
	
	public Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Date()
	{
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void addDays(int days)
	{
		LocalDate date = LocalDate.of(year, month, day);
		date = date.plusDays(days);
		
		this.year = date.getYear();
		this.month = date.getMonthValue();
		this.day = date.getDayOfMonth();
	}
	
	public void addWeeks(int weeks)
	{
		LocalDate date = LocalDate.of(year,  month,  day);
		date = date.plusWeeks(weeks);
		
		this.year = date.getYear();
		this.month = date.getMonthValue();
		this.day = date.getDayOfMonth();
	}
	
	public int daysTo(Date other)
	{
		LocalDate date = LocalDate.of(year, month, day);
		LocalDate date2 = LocalDate.of(other.getYear(), other.getMonth(), other.getDay());
		return (int)ChronoUnit.DAYS.between(date, date2);
	}
	
	public boolean isLeapYear()
	{
		if((year % 100 == 0 && year % 400 == 0) || year % 4 == 0)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return year + "/" + month + "/" + day;
	}
}
