/*
A marker interface is an empty interface (i.e., it has no methods or fields)
used to provide metadata or mark a class with a special meaning or behaviour.
Examples: Serializable, Clone-able
Serializable – Allows the object to be converted into a byte stream for storage or transmission.
Cloneable – Allows the object to be cloned using the clone() method without throwing CloneNotSupportedException.
Example 2: Cloneable Marker Interface
Why it works?
Cloneable has no methods, but if you don't implement it and still call clone(),
it throws CloneNotSupportedException.
 */
package dheeraj.javaconcepts.inter_face;

class Person implements Cloneable {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override clone method
    @Override
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MarkerCloneableExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person(1, "Dheeraj");
        Person p2 = (Person) p1.clone();  // Allowed because class implements Cloneable

        System.out.println("Original: " + p1.id + ", " + p1.name);
        System.out.println("Cloned: " + p2.id + ", " + p2.name);
    }
}
/*
OUTPUT:
Original: 1, Dheeraj
Cloned: 1, Dheeraj
*/
