package readingAssignment2;

public class WaitTime {

	public static void main(String[] args) {
		int waitTime = 12;
		
		try 
		{
			System.out.println("Try block entered.");
			if(waitTime > 30)
				throw new Exception("Time Limit Exceeded.");
			System.out.println("Leaving try block.");
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("After catch block");
	}

}
