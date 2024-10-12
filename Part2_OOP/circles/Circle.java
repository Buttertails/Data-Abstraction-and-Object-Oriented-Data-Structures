package circles;

/**
 * A circle class to create a circle object
 * @author Drew Elliott
 */

public class Circle {
	//part 1: attributes
	private double radius;
	private String color;
	
	/**
	 * Constructor  
	 * initializes fields
	 * @param radius
	 * @param color
	 */
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	/**
	 * Default Constructor 
	 * initializes fields
	 */
	public Circle()
	{
		radius = 1;
		color = "Purple";
	}
	
	/**
	 * Calculates area of the circle
	 * @return area of the circle
	 */
	public double getArea()
	{
		return Math.PI * radius * radius; 
	}
	
	/**
	 * Get the color of the circle
	 * @return color of the circle
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * Set the radius of the circle
	 * @param r radius of the circle
	 */
	public void setRadius(double r)
	{
		this.radius = r;
	}
	
	/**
	 * Set the color of the circle
	 * @param c color of the circle
	 */
	public void setColor(String c)
	{
		this.color = c;
	}
	
	/**
	 * To merge with another circle
	 * @param c2 another circle object
	 */
	public void merge(Circle c2)
	{
		double area = this.getArea() + c2.getArea();
		radius = Math.sqrt(area/Math.PI);
	}
}
