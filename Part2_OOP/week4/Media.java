package week4;

public class Media {
	private String id;
	private String name;
	
	public Media(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public Media()
	{
		this("NA","NA");
	}
	
	public void setID(String id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return ("ID: " + id +
				", Name: " + name);
	}
}
