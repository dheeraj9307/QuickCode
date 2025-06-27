//Using HashMap (via entrySet)
package dheeraj.collection.iterable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
            map.put(3, "C++"); // 🔥 Modifying during iteration → Fail-Fast
        }
    }
}
//1 = Java
// Output: java.util.ConcurrentModificationException
