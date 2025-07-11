/*
Represents a boolean-valued function (a condition) of one argument.
Used to test or filter data based on a condition.
🗣️ Example use case:
Filtering a list of users to find those older than 18.
 */
package dheeraj.java8functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(20));  // true
        System.out.println(isAdult.test(15));  // false
    }
}
