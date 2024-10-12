package convertTime;

public class HourOutOfBoundException extends Exception{
	public HourOutOfBoundException()
	{
		super("Hour out of bounds");
	}
	public HourOutOfBoundException(String s)
	{
		super(s);
	}
}
