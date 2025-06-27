package dheeraj.collection.iterable;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            // Optional: removing an element safely
            if (fruit.equals("Banana")) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removal: " + fruits);
    }
}
