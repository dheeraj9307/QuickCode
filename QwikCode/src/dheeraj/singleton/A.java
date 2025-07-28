/*
Singleton Class:
-We design the class in such that only one object of that class at most can be created.
✅ Steps to Create a Singleton Class in Java
Step 1: Create a private static reference variable of the class
This holds the only object of the class.
Step 2: Make the constructor private
This ensures no one can create the object using new from outside the class.
Step 3: Provide a public static synchronized method to return the instance
This method is used to get the only instance.
It ensures the object is created only once (lazy initialization).
How it works now?
When multiple threads call getInstance() at the same time,
only one thread can enter the method at a time because of the synchronized lock.
Therefore, only one object will be created, no matter how many threads run.
Note:- If I remove synchronized, multiple threads may create multiple objects,
which breaks the Singleton property.
 */
package dheeraj.singleton;

public class A {

	private static A a1 = null;

	private A() {

	}

	public static  synchronized A getInstance() {

		if (a1 == null) {
			System.out.println(" creating objects.....");
			a1 = new A();

		}
		return a1;

	}

	public static void main(String[] args) {
//		A a1= A.getInstance();
//		A a2=A.getInstance();
//		System.out.println(a1);
//		System.out.println(a2);
//
//		System.out.println(a1==a2);

	}

}

class Test extends Thread {

	public void run() {
		System.out.println(" thread......");
		A a1 = A.getInstance();
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Test());
		t1.start();

		Thread t2 = new Thread(new Test());
		t2.start();

		Thread t3 = new Thread(new Test());
		t3.start();

		Thread t4 = new Thread(new Test());
		t4.start();

		Thread t5 = new Thread(new Test());
		t5.start();

	}

}


/* 
OUTPUT:Can be 
thread......
thread......
thread......
thread......
thread......
creating objects.....
OR
thread......
creating objects.....
thread......
thread......
thread......
thread......

*/