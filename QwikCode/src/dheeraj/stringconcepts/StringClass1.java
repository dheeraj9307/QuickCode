package dheeraj.stringconcepts;

public class StringClass1 {
	public static void main(String[] args) {
		String s1 = new String("Employee"); // here new object create
		String s2 = new String("Employee"); // here another new object create

		System.out.println("s1==s2 : " + (s1 == s2)); // s1==s2 : false
		System.out.println("s1.euals(s2) : " + s1.equals(s2)); // s1.euals(s2) : true

	}
}
