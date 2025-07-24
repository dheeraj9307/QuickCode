/*
A Thread is a lightweight sub-task or a small part of a program that can run independently.
Multi-threading means executing multiple threads concurrently.
# How to Create a Thread in Java? 
1. By extending the Thread class
2. By implementing the Runnable interface
3. By implementing the Callable interface (used with ExecutorService for tasks that return a result)
## By Implementing the Callable Interface:
Steps:
    1. Create a class that implements Callable<T>.
    2. Override the call() method to return a result.
    3. Create an object of that class.
    4. Submit the object to ExecutorService.
    5. Use Future to get the result of the computation.
Note: 
-Always call shutdown() on ExecutorService to release resources.
-Runnable.run() returns void, but Callable.call() returns a value.
-ExecutorService manages thread life-cycle for better control.
-Future.get() blocks until the result is available.
-I can call future.get() to get the result later (it blocks if the task isn't finished yet).
Note:
The actual use of Future is to hold the result returned by the call() method of a Callable task, 
so I can retrieve it later when the task completes.
*/
package dheeraj.multithreadingconcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableThread implements Callable<String> {

	@Override
	public String call() {
		return "This is my Thread by implementing the Callable interface.";
	}

	public static void main(String[] args) throws Exception {
		MyCallableThread t1 = new MyCallableThread();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<String> future = executor.submit(t1); // returns Future
		String result = future.get(); // blocks until result is available
		System.out.println(result);

		executor.shutdown(); // Always shut down the executor
	}

}
