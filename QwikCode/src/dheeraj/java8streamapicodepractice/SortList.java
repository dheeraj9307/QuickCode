/*
Comparable is used when a class defines its own natural or default sorting order by implementing 
the compareTo() method.
Comparator is used when I need multiple or custom sorting logic without modifying the original class.
It is implemented using the compare() method.
For example: 
if I have an Employee class and I want to sort by name as the default,
I can implement Comparable in the class itself.But if later I want to sort by salary or ID, 
I can use Comparator outside the class without touching the existing class logic.
Note:
When I'm working with external libraries or classes that I cannot modify directly,
but I still want to sort the objects based on some custom logic, I use Comparator. 
Since I can't implement Comparable in those classes, Comparator allows me 
to define sorting externally without changing the original source code.
# Sort a list of integers in ascending and descending order
--------------------------------------------------------------------------------
Explanation:
1:Creates a fixed-size list of integers: [2, 6, 3, 8, 5, 9, 1].
nums.stream() → Converts the list into a Stream so we can use stream operations.
sorted() → Sorts the elements in natural order (ascending for numbers).
collect(Collectors.toList()) → Collects the sorted elements back into a new List.
Result → [1, 2, 3, 5, 6, 8, 9].
sorted(Comparator.reverseOrder()) → Sorts elements in reverse natural order (descending).
Result → [9, 8, 6, 5, 3, 2, 1].
 */
package dheeraj.java8streamapicodepractice;

import java.util.*;
import java.util.stream.*;

public class SortList {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,6,3,8,5,9,1);
		
		List<Integer> asc= nums.stream().sorted().collect(Collectors.toList());
		System.out.println("default order is Acending :"+ asc);
		
		//if you want descending order
		List<Integer> des= nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending order :"+ des);
	}

}
