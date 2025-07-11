/*
Encapsulation – Hiding internal data and providing controlled access.
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
Real-life Example of Encapsulation: Bank ATM
When I use an ATM to check my bank balance or withdraw cash,
I don’t see the inner workings of the bank’s system. The balance is private
I can’t directly access or change it. I interact with the system through controlled access methods,
like PIN verification, balance inquiry, and withdrawal.
Data Hiding:
If you make a variable private, it's called Data Hiding.
And when you provide public getter and setter methods to access and modify the value, you’re allowing
controlled access to that hidden data.
Difference:
You can have data hiding without full encapsulation, but you cannot have proper encapsulation without data hiding.
Example: Proper Encapsulation (Includes Data Hiding)
in this example the balance is hidden and the class controls
how money is deposited or withdrawn, preventing invalid operations.
 */
package dheeraj.oppsconcepts.encapsulation;

public class BankAccount {
    private double balance;  // Private field to hold balance

    // Getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}
