package week5;

/**
 * Object that represents a triangle
 * Can calculate the area and perimeter of a triangle
 * @author Drew Elliott
 */
public class Triangle extends Shape{
	private double a,b,c;
	
	/**
	 * Constructor 
	 * @param a side of a triangle
	 * @param b side of a triangle
	 * @param c side of a triangle
	 */
	public Triangle(double a, double b, double c, String color)
	{
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Default Constructor
	 */
	public Triangle()
	{
		this(0, 0, 0, "NA");
	}
	
	/**
	 * Calculates area of a triangle
	 * @return the area of a triangle
	 */
	public double getArea()
	{
		double s = ((a + b + c) / 2);
		return (Math.sqrt(s * (s-a) * (s-b) * (s-c)));
	}
	
	/**
	 * Calculates the perimeter of a triangle
	 * @return the perimeter of a triangle
	 */
	public double getPerimeter()
	{
		return a + b + c;
	}
}
