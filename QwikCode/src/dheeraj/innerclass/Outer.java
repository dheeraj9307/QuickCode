/*
An Inner Class is a class defined inside another class.
Java supports 4 types of inner classes:
• Member Inner Class (non-static)
• Static Nested Class
• Local Inner Class (inside a method)
• Anonymous Inner Class(People often say anonymous class,
but the correct and complete term is anonymous inner class in Java. )

Example: Member Inner Class (non-static)
 */
package dheeraj.innerclass;

public class Outer {

	class Inner{
		void show() {
			System.out.println("This is inner class !!");
		}
	}
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner= outer.new Inner(); //Creating inner class object
		inner.show(); //This is inner class !!
	}

}