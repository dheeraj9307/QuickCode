package dheeraj.java8streamapicodepractice;
import java.util.*;
import java.util.stream.*;
public class JoinStringsWithComma {
	public static void main(String[] args) {
		 List<String> words = Arrays.asList("Java", "Spring", "Boot");
		 
		 String joined = words.stream()
		            .collect(Collectors.joining(","));

		        System.out.println(joined); // Java,Spring,Boot
	}

}
