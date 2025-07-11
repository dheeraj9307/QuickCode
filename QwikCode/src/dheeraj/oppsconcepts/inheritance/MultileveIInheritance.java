/*
Multi-level Inheritance
When there is chain of inheritance it is known as Multi-level Inheritance.
Example: B inherit From A and C inherit from B
 */
package dheeraj.oppsconcepts.inheritance;


class A{
	void msgA() {
		System.out.println("Message from A");
	}
}

class B extends A{
	void msgB() {
		System.out.println("Message from B");
	}
}

class C extends B{
	void msgC() {
		System.out.println("Message from C");
	}
}
public class MultileveIInheritance {
	public static void main(String[] args) {
		C obj=new C();
		obj.msgA();
		obj.msgB();
		obj.msgC();
	}

}
