/*
✅ Real-life Example Overloading :
Just like in a calculator, you can use the same "add" button to add two numbers, three numbers, or even decimals — depending on the input.
In Java, we achieve this using method overloading, where the method name is the same but the parameters are different.
 */
package dheeraj.oppsconcepts.polymorphism;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	// Overloaded method with three int parameters
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Overloaded method with two double parameters
	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("Add 2 ints: " + calc.add(10, 20)); // 30
		System.out.println("Add 3 ints: " + calc.add(10, 20, 30)); // 60
		System.out.println("Add 2 doubles: " + calc.add(5.5, 6.5)); // 12.0
	}
}
