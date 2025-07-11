/*
Map: Key-value pair with unique key(store data as a key-value pair where each key is unique
but value can be different/duplicates).
-maintain order, For insertion Order and O(1)
 */
package dheeraj.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
  public static void main(String[] args) {
	Map<String, Integer> products=new LinkedHashMap<>();

	 products.put("lG",12000);
	 products.put("MOTO",12000);
	 products.put("Samsung",19000);
	 products.put("Apple",140000);
	 products.put("Redmi",1200);

	 System.out.println(products);
	 products.put("MOTO",18000);


	 System.out.println(products);
}

}
