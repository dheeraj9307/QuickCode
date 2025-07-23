/*
Option 1:
I can make Singleton thread-safe by using Synchronized Method 
or 
make a Method Synchronized to get Singleton thread-safe 
(synchronized makes sure only one thread can enter this method at a time)
Option 2: Double-Checked Locking (Efficient)
 */
package dheeraj.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton t1=null;
	
	private ThreadSafeSingleton() {
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(t1==null) {
			t1= new ThreadSafeSingleton();
		}
		return t1;
	}
	 
	public static void main(String[] args) {
		ThreadSafeSingleton t0=ThreadSafeSingleton.getInstance();
		System.out.println(t0);
				
	}

}
