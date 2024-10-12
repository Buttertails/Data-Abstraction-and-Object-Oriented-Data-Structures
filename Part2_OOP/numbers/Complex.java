package numbers;

/**
 * Complex class that holds the information about two different
 * complex expressions
 * @author Drew Elliott
 */
public class Complex implements Number{
    private double real1, real2;
    private double complex1, complex2;

    /**
     * Constructor
     * @param real1 	- real number for first expression
     * @param complex1	- coefficient of imaginary number for first expression
     * @param real2		- real number for second expression
     * @param complex2	- coefficient of imaginary number for second expression
     */
    public Complex(double real1, double complex1, double real2, double complex2)
    {
        this.real1 = real1;
        this.complex1 = complex1;
        this.real2 = real2;
        this.complex2 = complex2;
    }
    
    /**
     * Default Constructor
     */
    public Complex()
    {
        this(0, 0, 0, 0);
    }

    /**
     * Adds the two complex expressions together
     */
    public void addition()
    {
        real1 += real2;
        complex1 += complex2;
    }

    /**
     * Subtracts the second expression from the first expression
     */
    public void subtraction()
    {
        real1 -= real2;
        complex1 -= complex2;
    }

    /**
     * Display the first complex expression
     * Result of addition or subtraction
     */
    public void display()
    {
        if(complex1 < 0)
            System.out.println(real1 + " - " + (complex1 * -1) + "i");
        else if(complex1 > 0)
            System.out.println(real1 + " + " + complex1 + "i");
        else
            System.out.println(real1 + " + " + "i");
    }

	public double getReal1() {
		return real1;
	}

	public void setReal1(double real1) {
		this.real1 = real1;
	}

	public double getReal2() {
		return real2;
	}

	public void setReal2(double real2) {
		this.real2 = real2;
	}

	public double getComplex1() {
		return complex1;
	}

	public void setComplex1(double complex1) {
		this.complex1 = complex1;
	}

	public double getComplex2() {
		return complex2;
	}

	public void setComplex2(double complex2) {
		this.complex2 = complex2;
	}

	@Override
	public String toString() {
		return "Complex [real1=" + real1 + ", real2=" + real2 + ", complex1=" + complex1 + ", complex2=" + complex2
				+ "]";
	}
}
