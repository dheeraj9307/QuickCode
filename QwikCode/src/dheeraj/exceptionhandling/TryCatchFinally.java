/*
The try block contains code that may throw an exception, 
and the catch block handles the exception if it occurs.
try-catch-finally Example:
 */
package dheeraj.exceptionhandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
		  String s1=null;
		  System.out.println(s1.length()); // NullPointerException
		}
		catch(NullPointerException e) {
			System.out.println("We get Null Pointer Exception");
		}
		finally {
			System.out.println("Finally Block Executed ");
		}
	}

}
