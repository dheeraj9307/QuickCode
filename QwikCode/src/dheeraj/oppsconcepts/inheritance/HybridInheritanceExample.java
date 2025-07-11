/*
Hybrid Inheritance:
Hybrid inheritance is a combination of two or more types of inheritance.
It can involve a mix of single, multi-level, hierarchical, or multiple inheritance.
While Java doesn't directly support multiple inheritance (i.e., inheriting from more than one class)
due to the diamond problem, hybrid inheritance can be achieved using interfaces.
In a hybrid inheritance structure, you could see elements of single-level inheritance,
multi-level inheritance, and hierarchical inheritance in the same design.
Key Points:
• Without Interfaces: Java can only support hybrid inheritance using single, multi-level, and
hierarchical inheritance, but not multiple inheritance.
• With Interfaces: You can achieve full hybrid inheritance, including multiple inheritance,
by implementing multiple interfaces.
 */
package dheeraj.oppsconcepts.inheritance;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class Base {
	void display() {
		System.out.println("Display from Base class");
	}
}

public class HybridInheritanceExample extends Base implements Printable, Showable {
	@Override
	public void print() {
		System.out.println("Printing...");
	}

	@Override
	public void show() {
		System.out.println("Showing...");
	}

	public static void main(String[] args) {
		HybridInheritanceExample obj = new HybridInheritanceExample();
		obj.display(); // from Base
		obj.print(); // from Printable
		obj.show(); // from Showable
	}

}
