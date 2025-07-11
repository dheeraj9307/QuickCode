/*
GETTER & SETTER
Getter returns a value. And Setter sets a value.
Why Use Getters and Setters?
Getters and setters provide controlled access to class fields,
supporting encapsulation, validation, and maintainability
 */
package dheeraj.javaconcepts;

public class Student {

	private int id;
	private String name;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setId(123);
		s1.setName("dheeraj");


		System.out.println(s1.getId());
		System.out.println(s1.getName());

	}
}
