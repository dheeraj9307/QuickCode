/*
HashMap made thread-safe using Collections.synchronizedMap().
- Original HashMap created first, then wrapped.
- Supports null key and values.
- Thread-safe for individual operations.
*/
package dheeraj.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
	public static void main(String[] args) {

		Map<String,Integer> products=new HashMap<>();

		products.put("lG",12000);
		products.put("MOTO",12000);
		products.put("Samsung",19000);
		products.put("Apple",140000);
		products.put("Redmi",1200);

		Map<String,Integer> products1= Collections.synchronizedMap(products);
		System.out.println("Thread-safe Map: " + products1);

		products.put("lG", 18000); // duplicate key
		System.out.println("Updated value for 'lG': " + products);

		products.put("lG", 1000);
		System.out.println("Latest value for 'lG': " + products);

		products.put(null, 1000); // null key allowed
		System.out.println("With null key: " + products);

	}

}
