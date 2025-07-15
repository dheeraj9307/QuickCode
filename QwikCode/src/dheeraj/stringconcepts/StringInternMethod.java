/*
What intern() does in Java:
If the string already exists in the string pool → it returns the reference from the pool.
If the string does not exist in the string pool → it adds it to the pool 
and returns the reference from the pool.
 */
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
