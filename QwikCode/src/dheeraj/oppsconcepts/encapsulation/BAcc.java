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
Difference:
You can have data hiding without full encapsulation, but you cannot have proper encapsulation without data hiding.
Example: Proper Encapsulation (Includes Data Hiding)
 */
package dheeraj.oppsconcepts.encapsulation;

public class BAcc {

	private int balannce; //DataHiding

	public void setBalance(int balance) {
		if(balance>0) {
			this.balannce=balance;

		}
		else {
			System.out.println("Invalid balance");
		}

	}
	public int getBalanec() {
		return balannce;
	}
	public static void main(String[] args) {
		BAcc b=new BAcc();
		b.setBalance(1234);
		System.out.println(b.getBalanec());
	}

}
