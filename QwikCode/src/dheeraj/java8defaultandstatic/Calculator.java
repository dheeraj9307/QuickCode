/*
static methods inside interfaces to keep common, reusable code in one place
 */
package dheeraj.java8defaultandstatic;

public interface Calculator {
	static int add(int a, int b) {
        return a + b;
    }
}
