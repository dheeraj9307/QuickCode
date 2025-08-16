/*
In case of NonString:
== equal operator and .equals() method both compare the references but if i want to compare  
.equals() method contents then i have to override the equals() method.
In case of String:
== equal operator compare the references and  .equals() method compare the contents.
 */
package dheeraj.stringconcepts;

public class Employee {

	String name;

	Employee(String name) {
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {

		Employee e1 = (Employee) obj;

		return this.name.equals(e1.name);
	}
	public static void main(String[] args) {
	  Employee emp1=new Employee("dheeraj");
	  Employee emp2=new Employee("dheeraj");
	  
	  System.out.println(emp1==emp2);//false
	  System.out.println(emp1.equals(emp2));//true
	}

}
