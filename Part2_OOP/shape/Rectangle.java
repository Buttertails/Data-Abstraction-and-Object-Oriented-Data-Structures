package shape;
/**
 * Object that represents a rectangle
 * Can calculate the area and perimeter of a rectangle
 * @author Drew Elliott
 */
public class Rectangle implements Shape{
	private double height;
	private double length;
	
	/**
	 * Constructor
	 * @param height height of a rectangle
	 * @param length length of a rectangle
	 */
	public Rectangle(double height, double length)
	{
		this.height = height;
		this.length = length;
	}
	
	/**
	 * Default Constructor
	 */
	public Rectangle()
	{
		this(0, 0);
	}
	
	/**
	 * Method calculates and returns the area of a rectangle
	 * @return the area of a rectangle
	 */
	public double getArea()
	{
		return (height * length);
	}
	
	/**
	 * Calculates the perimeter of a rectangle
	 * @return the perimeter of a rectangle
	 */
	public double getPerimeter()
	{
		return 2 * (height + length);
	}
}
