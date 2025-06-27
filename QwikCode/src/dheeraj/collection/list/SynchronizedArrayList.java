/*
ArrayList is faster and generally preferred in single-threaded environments.
If I want to use it in a multi-threaded environment, I need to make it thread-safe by manually synchronizing it (e.g., using Collections.synchronizedList).
Note: ArrayList is not synchronized by default, so we must explicitly make it synchronized when thread safety is required. 
 */
package dheeraj.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList {
	
	public static void main(String[] args) {
		
	List<Integer> num=new ArrayList<Integer>();
	num.add(12);
    num.add(16);
    num.add(7);
    num.add(17);
    num.add(16); 
    
    List<Integer> list= Collections.synchronizedList(num);
    System.out.println(list);

  }
}