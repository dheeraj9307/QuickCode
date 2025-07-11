/*
Default Methods:
It Allows interfaces to have method implementations without affecting existing classes.
Why?
To provide backward compatibility when modifying interfaces.
Backward compatibility means that new changes in the code do not break old/existing code.
 */
package dheeraj.java8defaultandstatic;

public interface Vehicle {
	 default void start() {
	        System.out.println("Vehicle started");
	    }
}
