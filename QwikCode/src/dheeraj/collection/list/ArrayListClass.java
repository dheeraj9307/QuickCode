/*
 LIST: allow duplicates and maintain order
 */
package dheeraj.collection.list;
import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
public static void main(String[] args) {

	List<Integer> num =new ArrayList<>();
	num.add(12);
	num.add(16);
	num.add(7);
	num.add(17);
	num.add(16);

	System.out.println(num);

}
}
