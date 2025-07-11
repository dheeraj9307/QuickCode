/*
Encapsulation – Hiding internal data and providing controlled access.
Encapsulation means wrapping data (fields) and methods (code) into a single unit called a class.
while restricting direct access to some of the object's components.
This is achieved by making variables private and providing public getter and setter methods
to control access and modification.
Real-life Example of Encapsulation: Employee Information System
In real life, an employee’s personal details like name and salary are confidential.
They are stored securely and not directly accessible to everyone.
Instead, we use controlled methods: getter methods to see the information,
and setter methods to update it carefully.
For example, the salary setter checks to make sure the salary is not negative before updating.
This way, data is protected and only valid changes are allowed.
 */
package dheeraj.oppsconcepts.encapsulation;

//Encapsulated class
public class Employee {
 // Fields are private (cannot be accessed directly from outside)
	private String name;
	private double salary;

	// Public setter to set value (controlled access)
	public void setName(String name) {
		this.name = name;

	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid Salary Ammount !");
		}

	}
	// Public getter to retrieve value
	public String getName() {

		return name;
	}

	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		 // Creating object of Employee class
		Employee e1=new Employee();

		// Setting values using setter methods
		e1.setName("Dheeraj Patel");
		e1.setSalary(12200.0);

		// Getting values using getter methods
		System.out.println(e1.getName()); //Dheeraj Patel
		System.out.println("Current Amount is : " +e1.getSalary());//12200.0
		e1.setSalary(63200.0);
		System.out.println("Now after changes the salary is : " +e1.getSalary());
	}
}
/*
Dheeraj Patel
Current Amount is : 12200.0
Now after changes the salary is : 63200.0
*/
