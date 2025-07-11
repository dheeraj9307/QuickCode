/*
In method overriding, the return type in the child class can be the same as the parent method
OR a subclass of the parent method’s return type — this is called a covariant return type.
Key Points:
Animal.eat() returns Food
Dog.eat() returns Bone, which is a subclass of Food
This is valid in Java due to covariant return types
 */
package dheeraj.oppsconcepts.polymorphism;

class Food {
	String getName() {
		return "Generic Food";
	}
}

class Bone extends Food {
	@Override
	String getName() {
		return "Bone";
	}
}

class Animal {
	Food eat() {
		return new Food();
	}
}

class Dog extends Animal {
	// Covariant return type: Bone is a subclass of Food
	@Override
	Bone eat() {
		return new Bone();
	}
}

public class TestCovariant {
	public static void main(String[] args) {
		Animal a = new Dog(); // upcasting
		Food f = a.eat(); // returns Bone object as Food
		System.out.println(f.getName()); // Output: Bone
	}
}
