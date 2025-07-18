/*
A Thread is a lightweight sub-task or a small part of a program that can run independently.
Multi-threading means running multiple threads at the same time.
#How to Create a Thread in Java? 
By extending the Thread class
By implementing the Runnable interface or Callable interface. 
1.By Extending the Thread Class
Steps:
    1. Create a class that extends the Thread class.
    2. Override the run() method.
    3. Create an object of your class.
    4. Call the start() method to begin thread execution.
 */
package dheeraj.multithreadingconcepts;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running using the Thread class");
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}

}
//OUTPUT:Thread is running using the Thread class
