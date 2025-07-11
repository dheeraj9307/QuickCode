/*
Single-level inheritance occurs when a class directly inherits from another class.
Example: The Car class inherits from the Vehicle class.
 */
package dheeraj.oppsconcepts.inheritance;

class Vehicle{
	void start() {
		System.out.println("Starting!!");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Driving");
	}
}

public class SingleLevelInharitence{
   public static void main(String[] args) {
	   Car c = new Car();
	       c.start();
	       c.drive();

     }
}
