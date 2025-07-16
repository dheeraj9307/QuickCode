/*
In case of String, == operator checks references and .equals() method checks contents. 
But in case of non-String, both == operator and .equals() method check references 
(specifically, .equals() method by default checks references. 
But if I want to check contents, then I have to override the .equals() method).
*/

package dheeraj.stringconcepts;

class Emp {
	String name;

	Emp(String name) {
		this.name = name;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Emp e1 = new Emp("Dheeraj");
		Emp e2 = new Emp("Dheeraj");

		System.out.println(e1 == e2);// false
		System.out.println(e1.equals(e2));// false
	}
}
