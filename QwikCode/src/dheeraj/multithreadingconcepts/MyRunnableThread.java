/*
A Thread is a lightweight sub-task or a small part of a program that can run independently.
Multi-threading means executing multiple threads concurrently.
# How to Create a Thread in Java? 
1. By extending the Thread class
2. By implementing the Runnable interface
3. By implementing the Callable interface (used with ExecutorService for tasks that return a result)

## By Implementing the Runnable Interface:
Steps:
    1. Create a class that implements Runnable.
    2. Override the run() method.
    3. Create an object of that class.
    4. Pass the object to the Thread constructor.
    5. Call the start() method to begin execution.
*/

package dheeraj.multithreadingconcepts;

public class MyRunnableThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("This is my Thread by implementing the Runnable interface.");
	}

	public static void main(String[] args) {
		MyRunnableThread myTask = new MyRunnableThread(); // Step 3
		Thread thread = new Thread(myTask);                // Step 4
		thread.start();                                    // Step 5
	}
}

// OUTPUT:
// This is my Thread by implementing the Runnable interface.
