/*
Changing the functionality of parents class method inside the child class is known as method overriding. 
Rules of Method Overriding in Java:
1:Same method name and parameters
→ The method signature must match exactly (name + parameter list).
2:Same return type or co-variant return type
→ The return type must be the same or a subclass (co-variant).
3:Access modifier cannot be more restrictive
→ You can widen access (e.g., protected → public), but not narrow it.
(e.g.,public → protected (narrower access)).
4:Used for Runtime Poly-morphism
→ JVM decides at runtime which method to call (based on object type).
5:Use of @Override annotation
→ Optional but recommended — helps catch errors during compilation.
Note:
❌ final, private, and static methods cannot be overridden
❌ Constructors cannot be overridden
The child class method cannot have more restrictive access than the parent method;
it can keep the same or widen it (e.g., protected → public), but not narrow it (e.g., public → protected).
 */
package dheeraj.oppsconcepts.polymorphism;

class Parent {
	
	protected String greet() {
		return "Hello from Parent1";
	}
}
class Child extends Parent{
	@Override
	public String greet() {
		return "Hello from Child";
	}
}
public class MethodOverridingExample {
	public static void main(String[] args) {
		Parent obj =new Child();
		System.out.println(obj.greet());
	}

}
//OUTPUT:Hello from Child
