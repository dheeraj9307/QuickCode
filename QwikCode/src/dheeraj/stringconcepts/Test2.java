/*
In case of String, == operator checks references and .equals() method checks contents. 
But in case of non-String, both == operator and .equals() method check references 
(specifically, .equals() method by default checks references. 
But if I want to check contents, then I have to override the .equals() method).
*/
package dheeraj.stringconcepts;

class Emp1 {
	String name;

	Emp1(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Emp1 other = (Emp1) obj;
		return this.name.equals(other.name);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Emp1 e1 = new Emp1("dheeraj");
		Emp1 e2 = new Emp1("dheeraj");

		System.out.println(e1 == e2);// false
		System.out.println(e1.equals(e2)); // true
	}

}
