/*
Real-life Example of Encapsulation: Student Information System
In a school’s student management system, each student’s details—like name and age—are stored securely.
Direct access to these details is not allowed. Instead,
I use getter methods to view the data and setter methods to update it.
For example, the setter for age checks if the age is valid before changing it.
This way, the data stays safe and controlled.
 */
package dheeraj.oppsconcepts.encapsulation;

public class Student {
	private String name;
	private int age;

	public void setName(String name) {
		this.name=name;

	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
		else {
			System.out.println("This is invalid Age");
		}
	}
     public String getName() {
    	return name;
     }

    public int getAge() {
    	return age;
    }

	public static void main(String[] args) {
	  Student student=new Student();
	  student.setName("Dheeraj");
	  student.setAge(18);

	  System.out.println(student.getName());
	  System.out.println(student.getAge());
	}

}
