/*
Abstraction is the process of hiding the internal implementation details and showing only the essential features to the user.
In Java, abstraction is achieved mainly by using abstract classes and interfaces.
Abstract Class:
Can have both abstract and non-abstract methods
Example 1: Abstraction using Abstract Class
 */
package dheeraj.oppsconcepts.abstraction;

abstract class Vehicle {
	// Abstract method
	abstract void start();

	// Non-abstract method
	void stop() {
		System.out.println("Vehicle stopped");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Bike started with kick");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car started with key");
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		Vehicle v;

		v = new Bike();
		v.start(); // Output: Bike started with kick
		v.stop(); // Output: Vehicle stopped

		v = new Car();
		v.start(); // Output: Car started with key
		v.stop(); // Output: Vehicle stopped
	}

}
