/*
Fail-Fast: If I modify a collection directly during iteration (like adding or removing elements),
it throws a ConcurrentModificationException. This behavior is known as fail-fast.
It happens with collections like ArrayList, HashSet, and HashMap because their iterators track internal changes using a modCount.
Note: Collection here means List, Set, Queue, and even Map views like keySet(), values(), entrySet().
modCount stands for "modification count."
It is an internal field used by Java collections (like ArrayList, HashMap) to track structural changes such as adding or removing elements.
When you create an iterator, it stores the current value of modCount.
During iteration, the iterator compares the stored modCount with the current modCount.
If they don't match, it means the collection was modified, and it throws a ConcurrentModificationException.
 */
package dheeraj.collection.iterable;
import java.util.ArrayList;
import java.util.List;

public class FailFastListExample {
public static void main(String[] args) {
	 List<String> list = new ArrayList<>();
     list.add("A");
     list.add("B");
     list.add("C");

     for (String value : list) {
         System.out.println(value);
         list.add("D"); // 🔥 Modifying during iteration → Fail-Fast
     }
}
}
/*
A
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
	at QwikCode/dheeraj.collection.iterable.FailFastListExample.main(FailFastListExample.java:16)
*/