/*
Local Inner Class (Inside Method)
A class defined inside a method of the outer class.
 */
package dheeraj.innerclass;

public class LocalInnerClass {
	void outerMehod() {
		class Inner {
			void show() {
				System.out.println("Local Inner Class");
			}
		}
		Inner inner = new Inner(); // Can be used only inside the method
		inner.show();
	}

	public static void main(String[] args) {
		LocalInnerClass local=new LocalInnerClass();
		local.outerMehod();
	}
}
