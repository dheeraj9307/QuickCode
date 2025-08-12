/*
findFirst() is used when the list might be empty and I want a safe Optional result,
whereas get(0) is used when I’m sure the list is not empty and need direct access
Note: .get() assumes the list is not empty; otherwise, it throws an exception.
Find the first element in a list using findFirst()
 */
package dheeraj.java8streamapicodepractice;

import java.util.*;
import java.util.stream.*;

public class FirstElement {
	public static void main(String[] args) {
//          List<String> list=  Arrays.asList("java","spring", "boot");
//          Optional<String> first= list.stream().findFirst();
//          System.out.println(first);
		
		
		List<String> list = Arrays.asList("apple", "banana", "cherry");
		String first = list.get(0);
		System.out.println(first);

	}
}
