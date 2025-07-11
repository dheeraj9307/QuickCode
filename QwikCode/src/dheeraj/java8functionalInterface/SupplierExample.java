/*
Supplier<T>
Represents a supplier of results — it does not take any input but returns a value.
Used when you want to generate or supply values without any input.
Example use case:
Generating a random number or current timestamp.
 */
package dheeraj.java8functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> new Random().nextDouble();

        System.out.println(randomValue.get());  // e.g., 0.742
        System.out.println(randomValue.get());  // e.g., 0.198
    }
}