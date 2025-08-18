/*
In case of NonString: 
== equal operator and .equals() method both compare the references but if i want 
.equals() method compare contents then i have to override the equals() method. And also 
override hashCode() to maintain the equals–hashCode contract, 
otherwise objects that are "equal" may not behave correctly in hash-based collections like:
HashSet, HashMap, Hashtable, LinkedHashSet, LinkedHashMap etc. 
If I override equals(), I must override hashCode() to follow the contract.
The contract says:
    1. If two objects are equal (equals() → true), then their hashCode() must be same.
👉 emp1.equals(emp2) → true
👉 so emp1.hashCode() == emp2.hashCode() → must also be true.
    2. If two objects are not equal, their hashCodes may or may not be different (collisions allowed).
Note:
If I don’t override hashCode() while overriding equals(), It will break the contract between equals() and hashCode(). 
Otherwise, logically equal objects may behave like duplicates in memory-based collections. 
Note:
ArrayList, LinkedList, Vector → they check duplicates or equality using only .equals().
TreeSet, TreeMap → they don’t use hashCode(), instead they use natural ordering (Comparable) or a Comparator. so in these, even if hashCode() is not overridden, your program still works fine hashCode() not required → ArrayList, LinkedList, Vector, TreeSet, TreeMap. 
In case of String: 
== equal operator compare the references and .equals() method compare the contents.
Note:
It Works, but not safe if someone passes null or a different class. so for that i have to add it.
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;                   // same reference
    if (obj == null || getClass() != obj.getClass()) return false;
    Employee e1 = (Employee) obj;
    return this.name.equals(e1.name);
}
If i not use, then This can throw a ClassCastException if someone passes a null or a different class or a different object type.
What does collisions allowed mean?
A hash collision happens when two different objects produce the same hashCode. 
 */
package dheeraj.stringconcepts;

public class Employee {

	String name;

	Employee(String name) {
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {

		Employee e1 = (Employee) obj;

		return this.name.equals(e1.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode(); // ensures equals-hashCode consistency
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("dheeraj");
		Employee emp2 = new Employee("dheeraj");
		
		System.out.println(emp1 == emp2);// false
		System.out.println(emp1.equals(emp2));// true
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		 // Collision example (different objects same hashCode)
        String s1 = "FB";
        String s2 = "Ea";
        System.out.println(s1.equals(s2));   // false
        System.out.println(s1.hashCode());   // 2236
        System.out.println(s2.hashCode());   // 2236 → collision

		
	}

}
