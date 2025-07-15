/*
throws Keyword is used to declare exceptions in method signature)
 */
package dheeraj.exceptionhandling;

public class ThrowsExample1 {
	static int divide(int a, int b) throws ArithmeticException {
		return a / b; // May throw ArithmeticException if b = 0
	}

	public static void main(String[] args) {
		try {
			int result = divide(12, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
