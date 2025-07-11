/*
1.Default Method – Real-Life Example:
Default methods when I want to provide a common behavior to all implementing classes.
For example, if I have a Payment interface and I want to add a logPayment() method that should
be available in all payment types like UPI, CreditCard, etc.,I define it as a default method
in the interface.
This way, all classes get the method automatically without breaking existing code.
 */
package dheeraj.java8defaultandstatic;

interface Payment {
	void pay(double amount);

	// Default method added later without breaking existing classes
	default void logPayment() {
		System.out.println("Payment logged successfully.");
	}
}

class CreditCardPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card.");
	}
}

class UpiPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI.");
	}
}

public class TestPayment {
	public static void main(String[] args) {
		Payment payment = new CreditCardPayment();
		payment.pay(1000);
		payment.logPayment(); // using default method

		Payment upi = new UpiPayment();
		upi.pay(500);
		upi.logPayment(); // reused default method
	}
}
