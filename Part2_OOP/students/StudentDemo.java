package students;

public class StudentDemo {

	public static void main(String[] args) {
		Student student1 = new Student("1234", "John", 3.8);
		Student student2 = new Student("4321", "Matt", 4.0);
		
		student1.updateName("Johnathan");
		student2.updateName("Matthew");
		
		System.out.println("Student 1:");
		System.out.println("ID: " + student1.getID());
		System.out.println("Name: " + student1.getName());
		System.out.println("GPA: " + student1.getGPA());
		System.out.println("\nStudent 2:");
		System.out.println("ID: " + student2.getID());
		System.out.println("Name: " + student2.getName());
		System.out.println("GPA: " + student2.getGPA());
	}
}
