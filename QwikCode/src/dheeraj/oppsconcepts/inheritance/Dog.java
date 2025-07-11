/*
Inheritance
In inheritance, we inherit the members (fields and methods) from the parent class to the child class
so that we can reuse them using the extends keyword.
Types of Inheritance
1:Single level Inheritance
2:Multi-level Inheritance
3:Hierarchical Inheritance
4:Multiple Inheritance
5:Hybrid Inheritance
 */
package dheeraj.oppsconcepts.inheritance;
class Animal{
	void eat() {
		System.out.println("Animal1 Eats");
	}
}
public class Dog extends Animal {
   void bark() {
	   System.out.println("Dog bark !!");
   }
   public static void main(String[] args) {
	Dog dog=new Dog();
	dog.eat();
	dog.bark();
}
}
