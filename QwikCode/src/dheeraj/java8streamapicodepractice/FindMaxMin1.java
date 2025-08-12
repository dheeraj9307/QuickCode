package dheeraj.java8streamapicodepractice;

import java.util.*;
import java.util.stream.*;

public class FindMaxMin1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 8, 2, 9);

		int max = nums.stream().max(Integer::compare).get();
		int min = nums.stream().min(Integer::compare).get();
		
		System.out.println("Max: " + max); // Max: 9
        System.out.println("Min: " + min); // Min: 2

	}

}
