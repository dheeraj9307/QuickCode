/*
Consumer<T>
Represents an operation that accepts a single input argument and returns no result.
Used when you want to perform some action with the input but don’t return anything.
Example use case:
Printing a message or saving a value.
 */
package dheeraj.java8functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = message -> System.out.println("Printing: " + message);

        printer.accept("Hello, World!");  // Printing: Hello, World!
        printer.accept("Java is fun.");   // Printing: Java is fun.
    }
}