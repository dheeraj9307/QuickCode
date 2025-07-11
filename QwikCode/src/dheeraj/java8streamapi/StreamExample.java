/*
Java 8 Stream API:
The Stream API in Java 8 allows you to process sequences of elements (like collections) in a functional and declarative style.
It supports operations such as filtering, mapping, and reducing.
Internally, stream operations are categorized into two types:
Intermediate Operations – These take a stream as input, perform a transformation, and return another stream.
For example: filter(), map(), sorted().
Terminal Operations – These take the stream as input and produce a final result like a value, collection, or side effect.
For example: collect(), forEach(), count().
sequences of elements  means any ordered collection or set of individual items that can be processed in sequence.
When to use filter(), map(), and sorted() in Java Streams?
Summary:
• Use filter() to filter out unwanted elements based on a condition.
• Use map() to transform or modify elements in the stream.(e.g., changing data types, modifying values)
• Use sorted() to sort the elements in the stream in a specific order.
 */
package dheeraj.java8streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ankit", "Bob", "Alex", "Anshul", "Charlie");

		List<String> result = names.stream().filter(name -> name.startsWith("A")) //Keep names starting with 'A'
				.map(String::toUpperCase) // Convert each name to uppercase
				.sorted() //Sort the names alphabetically
				.collect(Collectors.toList()); //Terminal operation to collect results

		System.out.println("Processed Names: " + result);
	}
}
/*
Output:
Processed Names: [ALEX, ANKIT, ANSHUL]
*/