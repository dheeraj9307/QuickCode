/*
Only two ways to implement an interface before Java 8:
Using a separate class
Using an anonymous inner class
From Java 8 onward, a third way was added:
Using a lambda expression (for functional interfaces only)
 */
package dheeraj.java8lambdaExpression;

public class AnonymousClassExample {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running using Anonymous Class");
			}
		};
		r.run();

	}
}
