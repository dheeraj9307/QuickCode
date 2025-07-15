package dheeraj.exceptionhandling;

public class MultiCatchJava7PlusExample {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length()); // NullPointerException
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("Exception caught: " + e);
		}
	}
}
/*
OUTPUT:
Exception caught: java.lang.NullPointerException: Cannot invoke "String.length()"
because "s" is null
*/