// Using HashMap (via entrySet)
package dheeraj.collection.iterable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;  //Required for Map.Entry

public class FailFastMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

            map.put(3, "C++"); // Structural modification → causes ConcurrentModificationException
        }
    }
}
