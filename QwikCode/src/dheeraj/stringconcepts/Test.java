/*
In case of String == operator  check references and .equal() method check contents  but in case of Non String 
== operator and .equal() method both check references(specially .equal() method by default check references but if
i want check contents then I have to override .equal() method)  
 */
package dheeraj.stringconcepts;

class Employee{
	int id;
	
	Employee(int id){
		this.id=id;
	}
}

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(2);

		System.out.println(e1 == e2);//false
		System.out.println(e1.equals(e2));//false
	}

}
