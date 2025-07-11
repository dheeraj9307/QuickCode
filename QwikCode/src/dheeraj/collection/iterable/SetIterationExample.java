package dheeraj.collection.iterable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterationExample {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Enhanced for-loop (for-each)
        System.out.println("Using enhanced for-loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            String fruit = itr.next();
            System.out.println(fruit);

            // Optional removal
            if (fruit.equals("Banana")) {
                itr.remove(); // Safe removal
            }
        }

        System.out.println("\nAfter removal: " + fruits);

	}

}
/*
 Using enhanced for-loop:
Apple
Mango
Banana

Using Iterator:
Apple
Mango
Banana

After removal: [Apple, Mango]

 */
