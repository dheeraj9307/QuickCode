/*
WAY TO ITERATE A LIST:
Enhanced for-loop = for-each loop in Java
Use enhanced for-loop for simplicity if no removal needed.
Use Iterator when you want to safely remove elements while iterating.
Use ListIterator for forward and backward traversal.
Use traditional for-loop when you need the index or want random access.
Use forEach (lambda) and Stream API for modern, concise code with Java 8+.
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
import java.util.Iterator;
import java.util.List;

public class ArrayListIterableExample {
    public static void main(String[] args) {

        // Collection (List implements Collection, which extends Iterable)
        List<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Hyderabad");

        // Enhanced for-loop → internally uses Iterable's iterator()
        System.out.println("Using enhanced for-loop:");

        for (String city : cities) {
            System.out.println(city);

        }

        // Using Iterator explicitly
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);

            // Optional: remove an element while iterating
            if (city.equals("Mumbai")) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removal: " + cities);
    }
}
