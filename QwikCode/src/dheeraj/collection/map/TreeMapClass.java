/*
Map: Key-value pair with unique key(store data as a key-value pair where each key is unique 
but value can be different/duplicates).
-For sorted data and O(logn)
 */
package dheeraj.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
	public static void main(String[] args) {
		Map<String, Integer> products=new TreeMap<String, Integer>();
		
		 products.put("lG",12000);
		 products.put("MOTO",12000);
		 products.put("Samsung",19000);
		 products.put("Boat",1400);
		 
		 products.put("Apple",140000);
		 products.put("Redmi",1200);
		 
		 System.out.println(products);
		 
		 products.put("MOTO",18000);
		 System.out.println(products);
	}

}
