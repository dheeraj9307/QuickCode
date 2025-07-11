package dheeraj.collection.list;

import java.util.LinkedList;

public class LinkedListC {
	public static void main(String[] args) {
		LinkedList<Integer>num=new LinkedList<>();

		num.add(12);
		num.add(16);
		num.add(7);
		num.add(17);
		num.add(16);

		System.out.println("Allow duplicates and maintain order");
		System.out.println(num);

		System.out.println("Good for insertion/deletion bez node base and TimeComplexcity O(1)");
		num.add(2,199);
		System.out.println(num);
		num.add(197); // not specified index by default it will goes into the last index because  maintain order
		System.out.println(num);

		System.out.println("Remove element at index 2 : i.e. " + num.remove(2));
		System.out.println("after removing element the list will be : "+num);

	    num.get(2);
	    System.out.println("Bad for random access and TimeComplexcity is O(n) : " + "I get at index 2 element : "+ num.get(2));
	}

}
