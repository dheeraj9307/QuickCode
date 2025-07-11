/*
Iterator: Interface (in java.util)
- Methods: hasNext(), next(), remove()
- Used to traverse elements in **forward direction only**
- Can be used with: List, Set, Queue
- Cannot modify (add/replace) elements during iteration (except remove) will throw:java.util.ConcurrentModificationException
- Obtained by: collection.iterator()
hasNext():
Checks if there is another element in the collection.
next(): Returns the next element in the iteration.
remove(): Removes the last element returned by next() from the underlying collection.
Note:
If you call next() without hasNext(), and there's no element, you'll get:
java.util.NoSuchElementException

 */
package dheeraj.collection.iterable;
import java.util.ArrayList;
import java.util.List;

public class ArrayListIterator {
	public static void main(String[] args) {
		 System.out.println("Using Iterator (forward):");
		List<String> city=new ArrayList<>();
		 city.add("delhi");
		 city.add("Kolkata");
		 city.add("mumbai");

		 for (String cities : city) {
			 System.out.println(cities);

		 }

	}

}
