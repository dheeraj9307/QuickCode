/*
Unique Elements(Order or unordered based on implementation and does not allow duplicates).
-LinkedHashSet is order and For insertion Order and O(1) 
 */
package dheeraj.collection.set;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetClass {
	public static void main(String[] args) {
		Set<Integer> num = new LinkedHashSet<Integer>(); 
		
		num.add(12);
		num.add(16);
		num.add(7);
		num.add(17);
		num.add(16);
		
		System.out.println(num);
	}

}
