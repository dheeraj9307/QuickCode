package dheeraj.stringconcepts;

public class StringInternMethod {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = "hello";

		// str1 is a new object, not from the pool
		System.out.println(str1 == str2); // false

		// Use intern() to get the reference from the pool
		String str3 = str1.intern();

		System.out.println(str2 == str3); // true
	}
}
