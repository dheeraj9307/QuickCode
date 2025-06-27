package dheeraj.collection.list;

import java.util.Vector;

public class VectorC {
	public static void main(String[] args) {
		Vector<Integer> num = new Vector<>();

	     num.add(10);
	     num.add(20);
	     num.add(30);
	     num.add(40);
	     num.add(20); // duplicate

	     System.out.println("Good for Random access/read and TimeComplexcity :O(1) (index-based), like ArrayList");
	     System.out.println(num);

	     System.out.println("\n Insert at index 2:");
	     num.add(2, 99);
	     System.out.println(num);

	     System.out.println("\n Add without index (goes to the end):");
	     num.add(77);
	     System.out.println(num);

	     System.out.println("\n Remove element at index 3: " + num.remove(3));
	     System.out.println("After removal: " + num);

	     System.out.println("\n Access by index is slower (O(n)):");
	     System.out.println("Element at index 2: " + num.get(2));
	 }

	}
	

