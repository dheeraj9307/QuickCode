/*
Finally always runs  even if exception occurs.
try-finally (without catch) Example:
 */
package dheeraj.exceptionhandling;

public class TryFinally {
public static void main(String[] args) {
	try {
		System.out.println("Inside try");
	}
	finally {
		 System.out.println("Finally always runs");
	}
	 System.out.println("This will  execute");
}
}
/*
Output:
Inside try
Finally always runs
*/