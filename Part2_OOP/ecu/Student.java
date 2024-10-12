package ecu;

public class Student extends Person{
	private double GPA;
	private String major;
	
	public Student(String name, String bannerId, double GPA, String major)
	{
		super(name, bannerId);
		this.GPA = GPA;
		this.major = major;
	}
	
	public Student(String name, String bannerId)
	{
		this(name, bannerId, 0, "NA");
	}
	
	public Student()
	{
		this("NA", "NA", 0, "NA");
	}
	
	public double getGPA()
	{
		return GPA;
	}
	
	public void setGPA(double GPA)
	{
		this.GPA = GPA;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String toString()
	{
		return (super.toString() +
				", GPA: " + GPA +
				", Major: " + major);
	}
}
