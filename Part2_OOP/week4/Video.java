package week4;

public class Video extends Media{
	private int runtime;
	
	public Video(String id, String name, int runtime)
	{
		super(id, name);
		this.runtime = runtime;
	}
	
	public Video()
	{
		this("NA", "NA", 0);
	}
	
	public void setRuntime(int runtime)
	{
		this.runtime = runtime;
	}
	
	public int getRuntime()
	{
		return runtime;
	}
	
	public boolean equals(Video other)
	{
		if(super.getID().equals(other.getID()) && super.getName().equals(other.getName()) && runtime == other.getRuntime())
		{
			return true;
		}
		else
			return false;
	}
	
	public void displayInfo()
	{
		System.out.println("Name: " + super.getName());
		System.out.println("ID: " + super.getID());
		System.out.println("Runtime: " + runtime);
	}
	
	public String toString()
	{
		return (super.toString() + 
				", Runtime: " + runtime);
	}
}
