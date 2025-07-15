/*
The finally block does not execute when the 
System.exit() is called in this case the finally block can be skipped.
 */
package dheeraj.exceptionhandling;

public class SkipFinallyBlock {
	
	public static void main(String[] args) {
		
		try {
			int i = 10/0;
		} 
		catch (Exception e) {
			System.out.println("This is Arithmetic Exception ");
			System.exit(0);
		}
		
		finally {
			System.out.println("This block will execute every time ");
		}
	}

}
//OUTPUT: This is Arithmetic Exception 
