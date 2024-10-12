package numbers;

/**
 * Program that tests the Fraction and Complex classes
 * @author Drew Elliott
 */
public class NumberDemo {

	public static void main(String[] args) {
		//Fraction object initialized with two fractions and their signs
		Fraction fraction = new Fraction(3, 4, true, 1, 4, true);
		
		//Complex object initialized with two complex expressions
		Complex complex = new Complex(3, 4, 5, 7);
		
		//Code to test addition methods
		fraction.addition();
		complex.addition();
		
		System.out.print("Fraction Test: ");
		fraction.display();		
		System.out.print("Complex Test: ");
		complex.display();
		
		//Reset fraction and complex values
		fraction = new Fraction(3, 4, true, 1, 4, true);
		complex = new Complex(3, 4, 5, 7);
		
		//Code to test subtraction methods
		fraction.subtraction();
		complex.subtraction();
		
		System.out.print("Fraction Test: ");
		fraction.display();
		System.out.print("Complex Test: ");
		complex.display();
	}
}
