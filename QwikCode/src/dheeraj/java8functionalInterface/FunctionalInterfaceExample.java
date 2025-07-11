/*
Functional Interface:
A functional interface is an interface with exactly one (incomplete) abstract method, but it can have multiple default and static methods.
It is mainly used for lambda expressions and functional programming in Java.
Examples: Runnable, Callable, Supplier, Consumer, Function, etc. — these are built-in functional interfaces introduced in Java 8.
Default method:
Allow you to define method implementation inside interfaces.
it help us to maintain the backward compatibility without breaking existing code.
and You can provide a default implementation in the interface itself, which can be optionally overridden by implementing classes.
Static Method:
It contains general-purpose utility logic that doesn't rely on object state.
It belongs to the interface itself, not the object.
Static methods are not inherited and cannot be overridden.
They are accessed using InterfaceName.methodName().
 */
package dheeraj.java8functionalInterface;

@FunctionalInterface
interface MyFunctionalInterface{

	void doWork();

	default void log() {
		System.out.println("Logging from default method...");
	}

	static void help() {
		System.out.println("helping from static method");
	}

}
public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface task =()->System.out.println("This is my functional interface");
		task.doWork();
		task.log();
		MyFunctionalInterface.help();

	}

}
