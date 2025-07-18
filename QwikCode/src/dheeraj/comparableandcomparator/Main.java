/*
Comparable is used when a class defines its own natural or default sorting order by implementing 
the compareTo() method.
Comparator is used when I need multiple or custom sorting logic without modifying the original class.
It is implemented using the compare() method.
For example, if I have an Employee class and I want to sort by name as the default,
I can implement Comparable in the class itself.But if later I want to sort by salary or ID, 
I can use Comparator outside the class without touching the existing class logic.
 
 */
package dheeraj.comparableandcomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Default sorting: by name
	@Override
	public int compareTo(Employee other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + salary;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Ravi", 50000));
		list.add(new Employee(102, "Amit", 70000));
		list.add(new Employee(103, "Suman", 60000));

		// Sort by name using Comparable
		Collections.sort(list);
		System.out.println("Sorted by name (Comparable):");
		for (Employee e : list) {
			System.out.println(e);
		}

		// Sort by salary using Comparator (descending order)
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return Double.compare(e2.salary, e1.salary); // descending salary
			}
		});

		System.out.println("\nSorted by salary (Comparator):");
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
/*
 * Sorted by name (Comparable): 102 - Amit - 70000.0 101 - Ravi - 50000.0 103 -
 * Suman - 60000.0
 * 
 * Sorted by salary (Comparator): 102 - Amit - 70000.0 103 - Suman - 60000.0 101
 * - Ravi - 50000.0
 * 
 */
