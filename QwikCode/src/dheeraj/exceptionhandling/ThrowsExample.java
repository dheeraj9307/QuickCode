/*
throws keyword is used to declare the exception i.e. it indicates the caller method that given
exception can occur so we have to handled it either using try catch block or again declare it by
using throw keyword  
or
throws Keyword is used to declare exceptions in method signature
or
throws = declare that a method might throw one or more exceptions
or
throw is used to manually throw an exception, while throws declares that a 
method might throw an exception which the caller must handle 
 */
package dheeraj.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	static void readFile() throws IOException {
		FileReader fr = new FileReader("test.txt"); // May throw FileNotFoundException
	}

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("Handled IOException: " + e.getMessage());
		}
	}
}
