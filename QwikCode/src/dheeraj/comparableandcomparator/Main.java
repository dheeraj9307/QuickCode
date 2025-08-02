/*
Comparable is used when a class defines its own natural or default sorting order by implementing 
the compareTo() method.
Comparator is used when I need multiple or custom sorting logic without modifying the original class.
It is implemented using the compare() method.
For example, if I have an Employee class and I want to sort by name as the default,
I can implement Comparable in the class itself.But if later I want to sort by salary or ID, 
I can use Comparator outside the class without touching the existing class logic.
Note:
When I'm working with external libraries or classes that I cannot modify directly,
but I still want to sort the objects based on some custom logic, I use Comparator. 
Since I can't implement Comparable in those classes, Comparator allows me 
to define sorting externally without changing the original source code.
or
I can’t implement Comparable in classes from external libraries because 
I don’t have access to modify their source code. In such cases, 
I use Comparator to define sorting logic externally and keep the design clean.
Note:
Even if you try to extend the class and override compareTo(),Java’s Collections.sort() 
or Stream.sorted() methods will still use the original class, not your subclass 
(unless you rewrite everything).
What is Future in Java?
The value returned by call() method  is stored inside the Future object,
and I use future.get() to access it.
or
Future is used to stored returned  value of call() method inside  Future object.
and I use future.get() to access it.
Note:
future.get() will block if the task is not yet completed."
This is how Future retrieves the result of an asynchronous computation

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
