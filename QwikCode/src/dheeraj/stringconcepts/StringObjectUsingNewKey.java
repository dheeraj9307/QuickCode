/*
If I create a String using the new keyword, it creates a new object in the heap,
but the literal part is checked in SCP — if not there, it gets added;
otherwise, the existing one is reused.
== Operator:
Compares references (memory address). 
.equals() Method:
Compares actual content (value) of the objects.
In case of non-String objects,
== always compares references,
.equals() by default also compares references (unless overridden),
so both behave the same until .equals() is explicitly overridden to compare content.


 */
package dheeraj.stringconcepts;

public class StringObjectUsingNewKey {
	public static void main(String[] args) {
		String s1 = new String("dheeraj");
		String s2 = new String("dheeraj");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
	}
}
