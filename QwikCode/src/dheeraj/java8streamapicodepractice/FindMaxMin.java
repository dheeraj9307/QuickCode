package dheeraj.java8streamapicodepractice;
import java.util.*;
import java.util.stream.*;

public class FindMaxMin {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(5, 8, 2, 9);
		 int max = Collections.max(numbers);
	     int min = Collections.min(numbers);
	     
	     System.out.println("Maximum number is : "+max);
	     System.out.println("Minimum number is : "+min);
		 
	}

}
