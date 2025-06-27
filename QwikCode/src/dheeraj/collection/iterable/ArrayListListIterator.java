package dheeraj.collection.iterable;
/*
ListIterator: Interface (in java.util)
- Methods: hasNext(), next(), hasPrevious(), previous(), add(), remove(), set()
- Used to traverse elements in **both forward and backward directions**
- Can modify (add/replace/remove) elements safely during iteration
- Works only with List (ArrayList, LinkedList), not  Set, Queue and Map values.
- Obtained by: list.listIterator()
hasNext():
→ Checks if there is a next element while moving forward.
next():
→ Returns the next element in forward direction.
hasPrevious():
→ Checks if there is a previous element while moving backward.
previous():
→ Returns the previous element in backward direction.
add(E e):
→ Inserts the given element into the list (before the next element).
set(E e):
→ Replaces the last element returned by next() or previous().
remove():
→ Removes the last element returned by next() or previous().
Note:
- Cannot call set/remove before calling next() or previous() — will throw IllegalStateException.
*/

//package dheeraj.collection.iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIterator {
    public static void main(String[] args) {
        System.out.println("Using ListIterator (forward and backward):");

        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Kolkata");
        cities.add("Mumbai");

        // Obtaining ListIterator
        ListIterator<String> itr = cities.listIterator();

        // 🔹 Forward Traversal
        System.out.println("Forward Traversal:");
        while (itr.hasNext()) {
            String city = itr.next();
            System.out.println(city);

            // Modify an element safely
            if (city.equals("Kolkata")) {
                itr.set("Kolkata (Updated)");
            }
        }

        // 🔹 Backward Traversal
        System.out.println("\nBackward Traversal:");
        while (itr.hasPrevious()) {
            String city = itr.previous();
            System.out.println(city);
        }

        // 🔹 Add & Remove while Iterating Forward Again
        System.out.println("\nModify (add/remove) while iterating again:");
        while (itr.hasNext()) {
            String city = itr.next();

            if (city.equals("Mumbai")) {
                itr.remove();           // Safely remove
                itr.add("Chennai");     // Safely add new
            }
        }

        System.out.println("\nFinal List: " + cities);
    }
}
