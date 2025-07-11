/*
Abstraction is the process of hiding the internal implementation details and showing only the essential features to the user.
In Java, abstraction is achieved mainly by using abstract classes and interfaces.
Abstract Class:
Can have both abstract and non-abstract methods
Example 2: Abstraction using Interface
 */
package dheeraj.oppsconcepts.abstraction;
interface Remote {
    void turnOn();
    void turnOff();
}

class TV implements Remote {
    @Override
	public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
	public void turnOff() {
        System.out.println("TV is OFF");
    }
}
public class AbstractionExample2 {

    public static void main(String[] args) {
        Remote r = new TV();
        r.turnOn();   // Output: TV is ON
        r.turnOff();  // Output: TV is OFF
    }
}

