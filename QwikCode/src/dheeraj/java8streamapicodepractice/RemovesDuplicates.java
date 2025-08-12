//Remove duplicate elements from a list
package dheeraj.java8streamapicodepractice;

import java.util.*;
import java.util.stream.*;

public class RemovesDuplicates {
	public static void main(String[] args) {
		
		List<Integer> nums= Arrays.asList(1,2,2,3,4,5,5,7,3,8);
		List<Integer> uniques = nums.stream().distinct().collect(Collectors.toList());
		
		System.out.println( uniques);
	}

}
