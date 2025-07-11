/*
Unique Elements(Order or unordered based on implementation and does not allow duplicates).
-TreeSet is UnOrder and For sorted data and O(logn)
 */
package dheeraj.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {

		Set<Integer> num=new TreeSet<>();
		num.add(12);
		num.add(16);
		num.add(7);
		num.add(17);
		num.add(16);

		System.out.println(num);
	}

}
