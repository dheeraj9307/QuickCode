//Example with Exception Thrown (No Catch Block)
package dheeraj.exceptionhandling;

public class TryFinallyWithException {
	public static void main(String[] args) {
		try {
			System.out.println("Inside try");
			int result = 10 / 0; // ArithmeticException
		}

		finally {
			System.out.println("Finally always runs even if exception occurs");
		}
		System.out.println("This will NOT execute due to exception");
	}
}

/*OUTPUT:
Inside try
Exception in thread "main" Finally always runs even if exception occurs
java.lang.ArithmeticException: / by zero
	at QwikCode/dheeraj.exceptionhandling.TryFinallyWithException.main(TryFinallyWithException.java:7)
*/