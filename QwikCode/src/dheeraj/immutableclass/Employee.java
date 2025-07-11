/*
 Declare the class as a final
 Make all fields private and final
 Don't provide setter only getter should be provided
 Initialize fields only by constructor(set all values when the object is created)
 Return deep copy of a mutable fields(if any), to prevent changes to input data
 we use because Thread-safe by default (no synchronization needed)
 */
package dheeraj.immutableclass;

public final class Employee {

	private final int id ;
	private final String name;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public  Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}



	public static void main(String[] args) {
	   Employee e1= new Employee(123, "dheeraj");
	   System.out.println(e1.getId());
	   System.out.println(e1.getName());
	}

}
