/*
• Use filter() to filter out unwanted elements based on a condition.
• Use map() to transform or modify elements in the stream.(e.g., changing data types, modifying values)
• Use sorted() to sort the elements in the stream in a specific order.
 */
package dheeraj.java8streamapicodepractice;

import java.util.*;
import java.util.stream.*;

public class UpperCaseString {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "mango");
		List<String> upper = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upper);

	}
}
