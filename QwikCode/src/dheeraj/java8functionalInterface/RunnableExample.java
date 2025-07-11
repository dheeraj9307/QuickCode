/*
Runnable:
A functional interface with a single abstract method void run() ; that does not return any value because return type void.
Used for running background tasks like logging, sending notifications, or displaying messages where no result is expected.
Example use case: Running a background task such as logging, sending a notification, or displaying a message—where no result is needed.
 */
package dheeraj.java8functionalInterface;

public class RunnableExample {
public static void main(String[] args) {
	 Runnable task = () -> System.out.println("Running a background task...");

     Thread thread = new Thread(task);
     thread.start();

     System.out.println("Main thread continues execution...");
}
}
