package week5;

public class MinuteOutOfBoundException extends Exception{
	public MinuteOutOfBoundException()
	{
		super("Minute is out of bounds");
	}
	
	public MinuteOutOfBoundException(String s)
	{
		super(s);
	}
}
