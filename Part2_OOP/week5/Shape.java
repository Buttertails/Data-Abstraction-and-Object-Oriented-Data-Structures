package week5;

public abstract class Shape {
	private String color;
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public Shape(String color)
	{
		this.color = color;
	}
	
	public Shape()
	{
		this("NA");
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
}
