package ecu;

public class Person {
	private String name;
	private String bannerId;
	
	public Person(String name, String bannerId)
	{
		this.name = name;
		this.bannerId = bannerId;
	}
	
	public Person()
	{
		this("NA", "NA");
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBannerId()
	{
		return bannerId;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBannerId(String bannerId)
	{
		this.bannerId = bannerId;
	}
	
	public String toString()
	{
		return ("\nName: " + name +
			    ", Banner ID: " + bannerId);
	}
}
