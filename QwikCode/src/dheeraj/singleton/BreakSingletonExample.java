/*
#Singleton is not thread-safe by default.
To make it thread-safe, you must use one of the following:
1:Synchronized method
2:Double-Checked Locking (DCL) with volatile
3:Static Inner Class (Bill Pugh Singleton)
Two different memory addresses (such as @3e3abc88 and @6ce253f1) prove two instances were created, 
which breaks the Singleton pattern.
 */
package dheeraj.singleton;

class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("Instance created by " + Thread.currentThread().getName());
	}

	public static Singleton getInstance() {
		if (instance == null) {
			try {
				// Simulate delay so threads overlap here
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new Singleton();
		}
		return instance;
	}
}

class SingletonTask implements Runnable {
	@Override
	public void run() {
		Singleton instance = Singleton.getInstance();
		System.out.println("Got instance: " + instance + " | Thread: " + Thread.currentThread().getName());
	}
}

public class BreakSingletonExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new SingletonTask(), "Thread-1");
		Thread t2 = new Thread(new SingletonTask(), "Thread-2");

		t1.start();
		t2.start();
	}
} 
/*
Instance created by Thread-1
Instance created by Thread-2
Got instance: dheeraj.singleton.Singleton@1f45c2ba | Thread: Thread-1
Got instance: dheeraj.singleton.Singleton@146467c4 | Thread: Thread-2
*/
