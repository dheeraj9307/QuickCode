/*
A Singleton can be thread-safe or not thread-safe, depending on how it's implemented.
How to make your Singleton thread-safe? 
Option 1:
I can make Singleton thread-safe by using Synchronized Method 
or 
make a Method Synchronized to get Singleton thread-safe 
(synchronized makes sure only one thread can enter this method at a time)
Option 2: Double-Checked Locking (Efficient)
Note:
The volatile keyword forces threads to read and write the variable directly from the main memory —
not from their local CPU cache.
So any thread will always see the most up-to-date value
 */
package dheeraj.singleton;

public class ThreadSafeSingleton1 {
    // Volatile ensures changes are visible to all threads
    private static volatile ThreadSafeSingleton1 instance = null;

    // Private constructor to prevent instantiation
    private ThreadSafeSingleton1() {
    }

    public static ThreadSafeSingleton1 getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (ThreadSafeSingleton1.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new ThreadSafeSingleton1();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton1 obj = ThreadSafeSingleton1.getInstance();
        System.out.println(obj);
    }
}