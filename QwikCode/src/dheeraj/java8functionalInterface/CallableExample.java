/*
Callable:
A functional interface with a single abstract method T call(). It returns a value.
It represents a task that returns a result and is allowed to throw checked exceptions.
It is commonly used to run tasks in the background when you need to get a result once the task completes.
Use case:
Performing a time-consuming task like downloading a file or processing data in the background and getting the result when it’s done.
Use Runnable when you just want to run code in a thread without returning anything.
Use Callable<T> when you want to run a task and get a result, or handle checked exceptions.
Note:
Executor Service is an interface in the java.util.concurrent package that provides a high-level API to manage and execute multiple tasks concurrently using a thread pool.
It allows you to submit Runnable or Callable tasks without manually creating and managing threads.
ExecutorService automatically manages thread creation and reuse using a thread pool, so you don’t need to create threads manually.
✅ Thread Pool – Final Definition
A Thread Pool is a pool (collection) of reusable threads managed by the JVM to execute multiple tasks concurrently.
Instead of creating a new thread for every task, the thread pool reuses existing threads, which improves performance.
 */
package dheeraj.java8functionalInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(2000); // Simulate time-consuming task
            return "File downloaded successfully!";
        };

        Future<String> future = executor.submit(task);
        System.out.println("Doing other work...");

        String result = future.get();  // Get result after task completes
        System.out.println(result);

        executor.shutdown();
    }
}

/*
Output:
Doing other work...
File downloaded successfully!
Returns a result, not just printing.
 */