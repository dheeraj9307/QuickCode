/*
Hierarchical Inheritance:
When two or more classes inherit from a single parent class, it is known as hierarchical inheritance.
In this type, one parent class has multiple child classes.
Example: If classes B and C both inherit from class A, that forms a hierarchical inheritance structure.
Note: Same class name in same package	❌ Not allowed (compile error)
 */
package dheeraj.oppsconcepts.inheritance;

//parent class
class A1 {
	void msgA() {
		System.out.println("Message from A");
	}
}

// First child class
class B1 extends A {
	void msgB() {
		System.out.println("Message from B");
	}
}

// Second child class
class C1 extends A1 {
	void msgC() {
		System.out.println("Message from C");
	}
}

public class HierarchicalInheritance {
// Main class to test
	public static void main(String[] args) {
		B1 objB = new B1();
		C1 objC = new C1();

		System.out.println("Using object of B:");
		objB.msgA(); // inherited from A
		objB.msgB(); // own method

		System.out.println("\nUsing object of C:");
		objC.msgA(); // inherited from A
		objC.msgC(); // own method
	}
}
