/*
Unchecked Exception: Exceptions that are not checked at compile time 
and occur during runtime (e.g.,NullPointerException, ArithmeticException,ArrayIndexOutOfBoundsException).
 */
package dheeraj.exceptionhandling;

public class UncheckedExceptionExample {
public static void main(String[] args) {
	int[]arr= {1,2,3,4};
	System.out.println(arr[5]);// ArrayIndexOutOfBoundsException
}
}
/*OUTPUT:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
at QwikCode/dheeraj.exceptionhandling.UncheckedExceptionExample.main(UncheckedExceptionExample.java:6)
*/