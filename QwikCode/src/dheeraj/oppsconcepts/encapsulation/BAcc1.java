/*
Encapsulation means wrapping data (fields) and methods (code) into a single unit called a class.
while restricting direct access to some of the object's components.
This is achieved by making variables private and providing public getter and setter methods
to control access and modification.
✅ Steps to Achieve Full Encapsulation in Java:
1️	Make all variables (fields) private to hide them from outside the class (Data Hiding)
2️	Provide public getter and setter methods to access and modify the fields in a controlled way
3️	Add validation logic (optional but best practice) in setter methods to prevent invalid data
4️	Keep class behavior (methods) and data (fields) together — i.e., everything related is inside one class
5️   Avoid direct access to fields from outside — access must go through methods only

Note: Data Hiding:
If I make a variable private, it's called Data Hiding.
Difference:
You can have data hiding without full encapsulation, but you cannot have proper encapsulation without data hiding.
Example: Proper Encapsulation (Includes Data Hiding) Not full/strong encapsulation because there is no validation or control in setBalance().
Anyone can set balance to any integer, including negative or invalid values.
 */

package dheeraj.oppsconcepts.encapsulation;

public class BAcc1 {
	private int balance;//DataHiding

	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	public static void main(String[] args) {
		BAcc1 b=new BAcc1();
		b.setBalance(123);
		System.out.println(b.getBalance());
	}

}
