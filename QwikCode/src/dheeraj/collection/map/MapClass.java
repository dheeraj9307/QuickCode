/*
Map: Key-value pair with unique key(store data as a key-value pair where each key is unique
but value can be different/duplicates).
HashMap:
-For fast access, get(), put(), remove() and O(1)
-Unordered
-Not thread-safe; use Collections.synchronizedMap() for thread safety.
-Allows 1 null key and multiple null values.
 */
package dheeraj.collection.map;
import java.util.HashMap;
import java.util.Map;

public class MapClass {
	public static void main(String[] args) {
		 Map<String,Integer> product =new HashMap<>();
		 product.put("lG",12000);
		 product.put("MOTO",12000);
		 product.put("Samsung",19000);
		 product.put("Apple",140000);
		 product.put("Redmi",1200);
		 System.out.println("HashMap does not gurantee order so Unorder: " +product);

		 product.put("lG",18000);//duplicate keys
		 System.out.println("2 same keys,values different, update latest value: "+product);

		 product.put("lG",1000);
		 System.out.println(product);

		 product.put(null,1000);
		 System.out.println(product);

	}

}
