/*
Comparator<T>
Represents a comparison function, which imposes a total ordering on some collection of objects.
Used to sort objects based on custom criteria.
Example use case:
Sorting a list of strings by their length.
 */
package dheeraj.java8functionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Christina", "Dave");

        Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        names.sort(byLength);

        System.out.println(names);  // [Bob, Dave, Alice, Christina]
    }
}