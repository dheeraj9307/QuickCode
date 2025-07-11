/*
METHOD-Overriding:
Here we inherit a method from parent class and modify its logic in child class by once again creating same method in child class.
Or
Changing the functionality of parents class method inside the sub class or child class is known as method overriding.
Rules:
• Method name and parameters must remain the same.
• Return type must be the same or a subclass (covariant) of the original return type.
• It is used for runtime Polymorphism.
 */
package dheeraj.oppsconcepts.polymorphism;

class Shape {
	 void draw() {
		System.out.println("Drawing shape");
	}
}

class Circle extends Shape {
	  @Override
	void draw() {
		System.out.println("Drawing Circle");
	}
}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing square");
	}
}

public class TestOverride {

	public static void main(String[] args) {
		Shape  s=new Shape ();
		s.draw();

		Shape s1=new Circle ();
		s1.draw();

		Shape s2=new Square();
		s2.draw();
	}

}
