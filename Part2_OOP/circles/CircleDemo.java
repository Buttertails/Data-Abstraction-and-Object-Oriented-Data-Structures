package circles;

public class CircleDemo {

	public static void main(String[] args) {
		Circle[] circles = new Circle[100];
		String[] colors = {"red", "green", "blue", "purple"};
		int red = 0, green = 0, blue = 0, purple = 0;
		double radius, sum = 0;
		
		for(int i = 0; i < circles.length; i++)
		{
			String color = colors[(int)(Math.random() * 4)];
			radius =(int)(Math.random() * 101);
			circles[i] = new Circle(radius, color);
			sum += circles[i].getArea();
			
			switch(circles[i].getColor())
			{
			case("red"):
				red++;
				break;
			case("green"):
				green++;
				break;
			case("blue"):
				blue++;
				break;
			case("purple"):
				purple++;
				break;
			}
		}
		System.out.println("Total Area: " + sum);
		System.out.println("Red Circles: " + red);
		System.out.println("Green Circles: " + green);
		System.out.println("Blue Circles: " + blue);
		System.out.println("Purple Circles: " + purple);
	}

}
