/*
The try block contains code that may throw an exception, 
and the catch block handles the exception if it occurs.
Basic Try-Catch Example
 */
package dheeraj.exceptionhandling;

public class BasicTryCatch {
	public static void main(String[] args) {
		try {
			int result = 11 / 0; // This will throw ArithmeticException
		} catch (Exception e) {
			System.out.println("Can not devide by Zero");
		}
	}
}
