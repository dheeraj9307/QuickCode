/*
Function<T, R>
Represents a function that accepts one argument and produces a result.
Used to transform data from one form to another.
🗣️ Example use case:
Converting a string to its length.
 */
package dheeraj.java8functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println(stringLength.apply("Hello"));  // 5
        System.out.println(stringLength.apply("Java"));   // 4
    }
}