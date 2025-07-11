/*
CLASS: Class -blueprint or template.
Class is a blueprint or template in Java.
It defines the structure of objects by including fields (variables), methods, and constructors.
Using this blueprint, we can create multiple objects with similar properties and behavior.
OBJECT: An object is a real instance(result) of a class.
It is created using the new keyword and can access the class's fields and methods.
 */
package dheeraj.oppsconcepts.classandobject;

public class Student {
	String name;
	int id;
	String section;

	public void showStudentDetails() {

		System.out.println("Student name is :" +name+ " And id : "+id+ " ,Section is :" +section);
	}


	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Dheeraj Patel";
		s1.id=1234;
		s1.section="A";

		s1.showStudentDetails();
	}

}
