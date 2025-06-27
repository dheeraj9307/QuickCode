package dheeraj.collection.list;

import java.util.ArrayList;

public class ArrayListC {
 public static void main(String[] args) {
	ArrayList<Integer> add = new ArrayList<>();
	add.add(12);
	add.add(16);
	add.add(7);
	add.add(17);
	add.add(16);
	
	System.out.println("Allow duplicates and maintain order");
	System.out.println(add);
	
	System.out.println("Good for random access bez index base");
	System.out.println("I get at index 2 element : "+ add.get(2)+" and Time complexcity is O(1)");
	System.out.println("Bad for insertion/deletion bez shift right side(insert)/left side(delete) and Time complexcity is O(n)");
	
	add.add(2, 34);
	System.out.println("INSERT ELEMENT at index 2 : " +add);
	
	add.remove(2);
	System.out.println("DELETE ELEMENT at index 2 :"+add);
    }
 }