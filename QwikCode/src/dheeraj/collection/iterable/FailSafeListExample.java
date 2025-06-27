/*
Fail-Safe: If I modify a collection during iteration and it does not throw a ConcurrentModificationException, 
this behavior is known as fail-safe. This is possible because the fail-safe iterator works on a clone or copy of the collection,
or it allows concurrent modifications safely (e.g., CopyOnWriteArrayList, ConcurrentHashMap).
*/
package dheeraj.collection.iterable;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeListExample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        for (String value : list) {
            System.out.println(value);
            list.add("C"); // ✅ Safe modification → Fail-Safe
        }
        System.out.println("Final List: " + list);
    }
}
// Output: No exception, List gets updated safely
/*
A
B
Final List: [A, B, C, C]

 */
