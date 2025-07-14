//Without toString(), I have to manually print each field.
package dheeraj.stringconcepts;

class Student1 {
	int id;
	String name;

	Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

 class ToStringClass1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "Dheeraj");
		Student1 s2 = new Student1(2, "Rahul");

		// Manually printing details
		System.out.println("Student ID: " + s1.id + ", Name: " + s1.name);
		System.out.println("Student ID: " + s2.id + ", Name: " + s2.name);
	}
}
