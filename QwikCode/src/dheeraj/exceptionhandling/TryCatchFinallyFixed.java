//Example Now, to handle the exception properly, add a catch block:
package dheeraj.exceptionhandling;

public class TryCatchFinallyFixed {
	public static void main(String[] args) {
		try {
			System.out.println("Inside try");
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Caught exception: " + e.getMessage());
		} finally {
			System.out.println("Finally always runs");
		}
		System.out.println("Program continues after exception is handled");
	}
}

/*OUTPUT:
Inside try
Caught exception: / by zero
Finally always runs
Program continues after exception is handled
*/