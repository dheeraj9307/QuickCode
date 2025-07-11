/*
An interface is a 100% contract-based type, which means if any class implements an interface,
it must implement all the methods defined in that interface.
• Before Java 8, all methods in an interface are by default public and abstract.
• From Java 8 onward, interfaces can have default and static methods with implementations.
• From Java 9 onward, private methods can also be defined inside interfaces for code reuse.
• Constants can be defined in interfaces as public static final variables, for example:
• public static final int MAX = 100;
Two main types : Functional Interface and Marker Interface
Only two ways to implement an interface before Java 8:
1:Using a separate class(basic approach:create Separate class that implements the interface)
2:Using an anonymous inner class
From Java 8 onward, a third way was added:
Using a lambda expression (for functional interfaces only)
 */
package dheeraj.javaconcepts.inter_face;

interface Vehicle {
	void start();

	default void fuelType() {
		System.out.println("Uses petrol or diesel");
	}

	static void serviceInfo() {
		System.out.println("Service every 6 months");
	}

	// Constant variable
	public static final int MAX_SPEED = 120;
}

public class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car started with a key");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.start(); // Car started with a key
		myCar.fuelType(); // Uses petrol or diesel
		Vehicle.serviceInfo(); // Service every 6 months
		System.out.println("Max Speed: " + Vehicle.MAX_SPEED);
	}
}
