package dheeraj.java8streamapicodepractice;

import java.util.*;
import java.util.stream.*;

public class FilterNamesStartingWithA {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Adam", "Eve");
		List<String> filtered = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

		System.out.println(filtered);

	}

}
