/*
A marker interface is an empty interface (i.e., it has no methods or fields)
used to provide metadata or mark a class with a special meaning or behaviour.
Examples: Serializable, Clone-able
Serializable – Allows the object to be converted into a byte stream for storage or transmission.
(Stored : saved to a file or database. Transmitted : sent over a network (like through an API or socket)).
Cloneable – Allows the object to be cloned using the clone() method without throwing CloneNotSupportedException.
Example 1: Serializable Marker Interface
Why it works?
Because Student implements Serializable, Java allows it to be written to and read from a file.
 */
package dheeraj.javaconcepts.inter_face;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class MarkerSerializableExample {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101, "Dheeraj");

        // Serialize object to file
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
        System.out.println("Object serialized");

        // Deserialize object from file
        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("Deserialized Student: " + s2.id + ", " + s2.name);
    }
}
/*
OUTPUT:
Object serialized
Deserialized Student: 101, Dheeraj
*/
