/*
 LIST: allow duplicates and maintain order
 */
package dheeraj.collection.list;

import java.util.List;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		List<Integer> num = new Vector<Integer>();
		num.add(12);
		num.add(16);
		num.add(7);
		num.add(17);
		num.add(16);
		
		System.out.println(num);
	}

}
