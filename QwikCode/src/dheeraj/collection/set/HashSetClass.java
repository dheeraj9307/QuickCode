/*
Unique Elements(Order or unordered based on implementation and does not allow duplicates).
HashSet -unordered, For performance : add(), remove(), contain() and O(1)
 */
package dheeraj.collection.set;
import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
	public static void main(String[] args) {
		Set<Integer> num=new HashSet<Integer>();
		num.add(12);
		num.add(16);
		num.add(7);
		num.add(17);
		num.add(16);
		
		System.out.println(num);
	}
	

}
