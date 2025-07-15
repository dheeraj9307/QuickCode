/*
throws Keyword(used to declare exceptions in method signature)
or
throws = declare that a method might throw one or more exceptions
or
throw is used to manually throw an exception, while throws declares that a 
method might throw an exception which the caller must handle 
 */
package dheeraj.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class SimpleThrowsExample {
	static void openFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // May throw FileNotFoundException (a type of IOException)
        System.out.println("File opened successfully!");
        fr.close();
    }

    public static void main(String[] args) {
        
        try {
            openFile(); // Call method that declares 'throws IOException'
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
