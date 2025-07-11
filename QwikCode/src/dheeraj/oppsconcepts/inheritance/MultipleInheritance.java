/*
Multiple Inheritance is a feature where a class can inherit from more than one parent.
Java does not support multiple inheritance with classes to avoid ambiguity (like the Diamond Problem),
but supports multiple inheritance through interfaces.
Example of Multiple Inheritance using Interfaces:
 */
package dheeraj.oppsconcepts.inheritance;

interface Aa {
	void show();
}

interface Ba {
	void display();
}

class Ca implements Aa, Ba {
	@Override
	public void show() {
		System.out.println("Show method from A");
	}

	@Override
	public void display() {
		System.out.println("Display method from B");
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Ca obj = new Ca();
		obj.show(); // Output: Show method from A
		obj.display(); // Output: Show method from B
	}
}
