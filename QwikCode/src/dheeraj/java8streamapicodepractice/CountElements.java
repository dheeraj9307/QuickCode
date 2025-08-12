package dheeraj.java8streamapicodepractice;
import java.util.*;
import java.util.stream.*;
public class CountElements {
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("a","b","c","d","e");
		    long totalCount= list.stream().count();
		    System.out.println(totalCount);
		
	}

}
