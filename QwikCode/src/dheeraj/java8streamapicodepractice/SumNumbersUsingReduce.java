package dheeraj.java8streamapicodepractice;

import java.util.*;

public class SumNumbersUsingReduce {
	public static void main(String[] args) {
		
		List<Integer>nums= Arrays.asList(1,2,3,4,5,6,7,8);
//		int sum = nums.stream()
//	            .reduce(0, Integer::sum);

		int sum = nums.stream()
	              .reduce(0, (a, b) -> a + b);

	        System.out.println(sum); //36
	}

}

/*
Explanation:
0 → identity (starting value)
(a, b) -> a + b → lambda that takes two integers (a is the running sum, b is the next element) 
and returns their sum.
Example with nums = [1, 2, 3, 4]:
Start: a = 0 (identity), b = 1 → sum = 1
a = 1, b = 2 → sum = 3
a = 3, b = 3 → sum = 6
a = 6, b = 4 → sum = 10
Note: Integer::sum → A method reference equivalent to (a, b) -> a + b.
*/