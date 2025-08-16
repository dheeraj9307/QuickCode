package dheeraj.code.casting;

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}

	void bark() {
		System.out.println("Dog-specific bark method");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}

	void meow() {
		System.out.println("Cat-specific meow method");
	}
}

public class Main {
	public static void main(String[] args) {
		// =============== Up-casting ===============
		Animal a1 = new Dog();// Dog object, reference as Animal
		a1.sound();// Calls Dog's overridden method
		// a1.bark(); //Compile-time error: Animal has no bark()
		// ((Dog) a1).bark(); // Down-casting to call Dog-specific method
		/*
		 * Compile-time: The compiler only looks at the type of the reference (Animal
		 * a1). It only allows methods that exist in Animal. Runtime: Java checks the
		 * actual object (new Dog()) and runs the method from Dog if it’s overridden.
		 * Output: Dog barks
		 * 
		 */
		// ========== Down-casting ==========
		Dog d1 = (Dog) a1; // Explicit cast to Dog
		d1.bark(); // ✅ Works, Dog-specific method
		d1.sound(); // ✅ Works, overridden method
		// ===== Another object =====
		Animal a2 = new Cat();
		a2.sound(); // ✅ Calls Cat's overridden method
		// ===== Wrong down-casting (ClassCastException) =====
		try {
			Dog d2 = (Dog) a2; // ❌ Cat cannot be cast to Dog
			d2.bark();
		} catch (ClassCastException e) {
			System.out.println("Exception caught: " + e);
		}
	}
}
