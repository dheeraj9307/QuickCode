/*
Basic Steps to Create a Custom Exception:
1️ Create a class that extends Exception (for checked) or RuntimeException (for unchecked)
2️ Add a constructor to pass a custom message.
3️ Use throw to throw your exception where needed.
4️ Use try-catch to handle it.
 */
package dheeraj.exceptionhandling;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			throw new MyException("This is a custom exception");
		} catch (MyException e) {
			System.out.println("Caught: " + e.getMessage());
		}
	}
}
