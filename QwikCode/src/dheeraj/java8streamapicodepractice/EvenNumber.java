/*
Arrays.asList()
Defined in: java.util.Arrays
Use: Converts an array to a fixed-size list.
Returns: A backed list (not fully independent of the array).
Modifiable?
✅ You can update elements (set()).
❌ You cannot add/remove elements (add(), remove() will throw UnsupportedOperationException).
toList(): Collecting elements from a Stream into a new mutable list
asList(): Converts an array to a fixed-size list and returns a backed list/original array. 
 */
//Find even numbers from a list
package dheeraj.java8streamapicodepractice;
import java.util.*;
import java.util.stream.*;
public class EvenNumber {
	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(2,7,9,5,12,13);
		
		List<Integer> even =  numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		//numbers.add(122); //Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println(even);
	}

}
//OUTPUT:[2, 12]

