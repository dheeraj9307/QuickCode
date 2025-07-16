/*
If I create a String using literals, it goes into the String Constant Pool (SCP).
== Operator:
Compares references (memory address). 
 */
package dheeraj.stringconcepts;

public class StringLiteralClass {
	public static void main(String[] args) {
		String s1 = "Dheeraj";
		String s2 = "Dheeraj";
		System.out.println(s1 == s2);// true
	}
}
