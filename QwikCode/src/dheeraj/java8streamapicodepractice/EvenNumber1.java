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
// Update all even numbers in the list by multiplying them by 10. 
package dheeraj.java8streamapicodepractice;
import java.util.*;
import java.util.stream.*;

public class EvenNumber1 {
	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(1,3,6,7,12,34,9);
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)%2==0) {
				numbers.set(i, numbers.get(i)*10);
			}
		}
		System.out.println(numbers);
		
	}

}
//OUTPUT:[1, 3, 60, 7, 120, 340, 9]
