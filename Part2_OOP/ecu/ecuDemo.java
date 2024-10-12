package ecu;

import java.util.Scanner;

public class ecuDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, bannerId, major, dept;
		double gpa, salary;
		
		System.out.print("Enter student name: ");
		name = input.nextLine();
		System.out.print("Enter student Banner ID: ");
		bannerId = input.nextLine();
		System.out.print("Enter student major: ");
		major = input.nextLine();
		System.out.print("Enter student gpa: ");
		gpa = input.nextDouble();
		input.nextLine();
		
		Student student = new Student(name, bannerId, gpa, major);
		
		System.out.print("Enter employee name: ");
		name = input.nextLine();
		System.out.print("Enter employee Banner ID: ");
		bannerId = input.nextLine();
		System.out.print("Enter employee dept: ");
		dept = input.nextLine();
		System.out.print("Enter employee salary: ");
		salary = input.nextDouble();
		Employee employee = new Employee(name, bannerId, salary, dept);
		
		input.close();
		
		System.out.println(student.toString());
		System.out.println(employee.toString());
	}

}
