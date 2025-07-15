/*
Checked Exceptions are known as compile-time-exceptions 
because they are checked by the compiler during compilation.
Example-FileNotFoundException- Thrown when trying to open a file that doesn’t exist.
ClassNotFoundException- Thrown when a class is not found at run-time due to an incorrect location or missing file.
IOException- Thrown when an input/output operation fails.
SQLException- Thrown when a database error occurs.
Checked Exception Example
 */
package dheeraj.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
	public static void main(String[] args) {
		try {

			FileReader file = new FileReader("test.txt"); // FileNotFoundException

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
//Output: File not found
