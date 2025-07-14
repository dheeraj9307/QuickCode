/*
I use the toString() method to return meaningful details of an object when it is printed.
or
With toString(), I can directly print the object and still get readable output.
 */
package dheeraj.stringconcepts;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Overriding toString() method
	@Override
	public String toString() {
		return "Student ID: " + id + ", Name: " + name;
	}
}

public class ToStringClass {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Dheeraj");
		Student s2 = new Student(2, "Rahul");

		System.out.println(s1); // Calls s1.toString()
		System.out.println(s2); // Calls s2.toString()
	}
}

/*
Student ID: 1, Name: Dheeraj
Student ID: 2, Name: Rahul

*/