package time;

public class Time {
	private int hour;
	private int minute;
	private final int HOUR_MIN = 0, HOUR_MAX = 23;
	private final int MINUTE_MIN = 0, MINUTE_MAX = 59;
	
	public Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	public Time()
	{
		this.hour = 0;
		this.minute = 0;
	}
	
	private boolean isValid(int hour, int minute)
	{
		if(hour >= HOUR_MIN && hour <= HOUR_MAX)
		{
			if(minute >= MINUTE_MIN && minute <= MINUTE_MAX)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public void setTime(int hour, int minute)
	{
		if(isValid(hour, minute))
		{
			this.hour = hour;
			this.minute = minute;
		}
		else
			System.out.println("Not Valid");
	}
	
	public void setTime(int hour, int minute, boolean isAM)
	{
		if(isValid(hour, minute))
		{
			if(isAM && hour != 12)
			{
				this.hour = hour;
				this.minute = minute;
			}
			else if(isAM && hour == 12)
			{
				this.hour = 0;
				this.minute = minute;
			}
			else if(!(isAM) && hour != 12)
			{
				this.hour = hour + 12;
				this.minute = minute;
			}
			else if(!(isAM) && hour == 12)
			{
				this.hour = hour;
				this.minute = minute;
			}
			else
				return;
		}
	}
}
