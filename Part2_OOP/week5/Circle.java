package week5;

/**
 * Object that represents a circle
 * Can calculate the area and perimeter of a circle
 * @author Drew Elliott
 */
public class Circle extends Shape{
	private double radius;
	
	/**
	 * Constructor
	 * @param radius radius of a circle
	 */
	public Circle(double radius, String color)
	{
		super(color);
		this.radius = radius;
	}
	
	/**
	 * Default Constructor
	 */
	public Circle()
	{
		this(0, "NA");
	}
	
	/**
	 * Calculates area of a circle
	 * @return the area of a circle
	 */
	public double getArea()
	{
		return (Math.PI * radius * radius);
	}
	
	/**
	 * Calculates the perimeter of a circle
	 * @return the perimeter of a circle
	 */
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
}
