package shape;

/**
 * Program that generates 20 random shape objects 
 * and displays the total area and perimeter of those shapes
 * @author Drew Elliott
 */
public class ShapeDemo {
	public static void main(String[] args) {
		final int MAX_SHAPES = 20;						//Max amount of shapes we can create
		int s;											//Holds a random value that determines shape to be created
		double totalArea = 0, totalPerimeter = 0;		//Holds the total area and perimeter of all random shapes created
		double a,b,c;									//Holds the sides of a triangle 
		Shape[] shapes = new Shape[MAX_SHAPES];			//Shape array to store the random shapes
		
		//Loop to create new shapes and gather the total area and perimeter
		for(int i = 0; i < MAX_SHAPES; i++)
		{
			//Chooses random number to determine what shape to be created
			s = (int)(Math.random() * 3);
			
			//Checks value of s and creates a shape object
			switch(s)
			{
			//Creates a random circle object with a random radius in the range 1-100
			case(0):
				shapes[i] = new Circle((Math.random() * 100) + 1);
				break;
			//Creates a random rectangle object with a random height and length in the range 1-100
			case(1):
				shapes[i] = new Rectangle((Math.random() * 100) + 1, (Math.random() * 100) + 1);
				break;
			//Creates a random triangle object with random side lengths in the range 1-100
			//Must check if the random side lengths create a valid triangle, where
			//(a + b > c) && (a + c > b) && (b + c > a), if valid store the circle object
			case(2):
				do
				{
					a = (Math.random() * 100) + 1;
					b = (Math.random() * 100) + 1; 
					c = (Math.random() * 100) + 1;
				}
				while(!isValid(a,b,c));
				shapes[i] = new Triangle(a,b,c);
				break;
			}
			
			//Add area of created shape to the total area
			totalArea += shapes[i].getArea();
			//Add perimeter of created shape to the total perimeter
			totalPerimeter += shapes[i].getPerimeter();
		}
		
		//Display total area and perimeter of the 20 shape objects
		System.out.println("Total Area: " + totalArea);
		System.out.println("Total Perimeter: " + totalPerimeter);
	}
	
	/**
	 * Checks if the sides create a valid triangle
	 * @param a side of a triangle
	 * @param b side of a triangle
	 * @param c side of a triangle
	 * @return true if valid, false if not
	 */
	public static boolean isValid(double a, double b, double c)
	{
		if((a + b > c) && (a + c > b) && (b + c > a))
			return true;
		else
			return false;
	}

}
