package week4;

public class CD extends Media{
	String genre;
	
	public CD(String id, String name, String genre)
	{
		super(id, name);
		this.genre = genre;
	}
	
	public CD()
	{
		this("NA", "NA", "NA");
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public boolean equals(CD other)
	{
		if(super.getID().equals(other.getID()) && super.getName().equals(other.getName()) && genre.equals(other.getGenre()))
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
		System.out.println("Genre: " + genre);
	}
	
	public String toString()
	{
		return (super.toString() + 
				", Genre: " + genre);
	}
}
