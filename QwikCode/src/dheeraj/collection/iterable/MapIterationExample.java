/*
Map cannot be directly iterated, but it can be iterated using its collection views like:
keySet() – to iterate keys
values() – to iterate values
entrySet() – to iterate key-value pairs
These views return a Set or Collection, which can then be iterated using for-each, Iterator, or Stream API.
Set and List can be directly iterated because both are part of the Collection interface, which extends Iterable, so they directly support iteration using:
Enhanced for-loop (for-each)
Iterator
Stream API etc.
 */
package dheeraj.collection.iterable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationExample {
	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Java");
	        map.put(2, "Python");
	        map.put(3, "C++");

	        // Using enhanced for-loop (entrySet)
	        System.out.println("Using enhanced for-loop (entrySet):");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	        // Using Iterator on entrySet
	        System.out.println("\nUsing Iterator (entrySet):");
	        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
	        while (itr.hasNext()) {
	            Map.Entry<Integer, String> entry = itr.next();
	            System.out.println(entry.getKey() + " = " + entry.getValue());

	            // Optional removal
	            if (entry.getKey() == 2) {
	                itr.remove(); // Safe removal
	            }
	        }

	        System.out.println("\nAfter removal: " + map);
	}

}
/*
Using enhanced for-loop (entrySet):
1 = Java
2 = Python
3 = C++

Using Iterator (entrySet):
1 = Java
2 = Python
3 = C++

After removal: {1=Java, 3=C++}

 */
