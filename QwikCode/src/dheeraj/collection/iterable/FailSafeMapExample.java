/*
Fail-Safe: If I modify a collection during iteration and it does not throw a ConcurrentModificationException,
this behavior is known as fail-safe. This is possible because the fail-safe iterator works on a clone or copy of the collection,
or it allows concurrent modifications safely (e.g., CopyOnWriteArrayList, ConcurrentHashMap).
 */
package dheeraj.collection.iterable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            map.put(3, "C++"); // ✅ Safe modification → Fail-Safe
        }
        System.out.println("Final Map: " + map);
    }
}

/*
1 = Java
2 = Python
3 = C++
Final Map: {1=Java, 2=Python, 3=C++}

*/