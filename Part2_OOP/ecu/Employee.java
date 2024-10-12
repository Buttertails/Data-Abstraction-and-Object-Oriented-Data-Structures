package ecu;

public class Employee extends Person{
	private double salary;
	private String dept;
	
	public Employee(String name, String bannerId, double salary, String dept)
	{
		super(name, bannerId);
		this.salary = salary;
		this.dept = dept;
	}
	
	public Employee(String name, String bannerId)
	{
		this(name, bannerId, 0, "NA");
	}
	
	public Employee()
	{
		this("NA", "NA", 0, "NA");
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public String toString()
	{
		return (super.toString() +
				", Salary: " + salary +
				", Dept: " + dept);
	}
}
