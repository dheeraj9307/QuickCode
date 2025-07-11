/*
Map: Key-value pair with unique key(store data as a key-value pair where each key is unique
but value can be different/duplicates).
ConcurrentHashMap: Thread-safe version of HashMap for use in multi-threaded environments.
- Stores key-value pairs where keys are unique, values can be duplicate.
-Does NOT allow null keys or null values.
- Allows concurrent read and thread-safe updates without locking the entire map.
- Unordered
 */
package dheeraj.collection.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {
public static void main(String[] args) {

	Map<String, Integer> product = new ConcurrentHashMap<>();

	product.put("LG", 12000);
	product.put("MOTO", 12000);
	product.put("Samsung", 19000);
	product.put("Apple", 140000);
	product.put("Redmi", 1200);
	//product.put("Redmi", null); Does NOT allow null keys or null values. (NPE)


	System.out.println("ConcurrentHashMap is Unordered and Thread-safe: " + product);

	product.put("LG", 18000); // duplicate key, updates value
	System.out.println("Updated value for duplicate key 'LG': " + product);

	product.put("LG", 1000);
	System.out.println("Latest value for 'LG': " + product);

     }
}

