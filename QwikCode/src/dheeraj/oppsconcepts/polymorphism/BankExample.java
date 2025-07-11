/*
Real-Life Example of Method Overriding:
Let’s say I visited HDFC Bank. They offer two types of accounts: Gold Account and Platinum Account.
In the Gold Account, they provide online banking and 0% interest.
In the Platinum Account, they also provide online banking, but with a 5% interest rate.
Here, both account types offer the same method — getRateOfInterest() — but the output/behavior is different depending on the account type.
So, we can say:
The PlatinumAccount class overrides the getRateOfInterest() method of the GoldAccount class to provide a different interest rate.
This is a real-life example of method overriding, where we change the behavior of a method in the subclass.
 */
package dheeraj.oppsconcepts.polymorphism;

class BankAccount {
	public double getRateOfInterest() {
		return 0.0;
	}

	public void onlineBankingFeature() {
		System.out.println("Online Banking is available.");
	}
}

class GoldAccount extends BankAccount {
	@Override
	public double getRateOfInterest() {
		return 0.0; // No interest for Gold Account
	}
}

// Child class: Platinum Account
class PlatinumAccount extends BankAccount {
	@Override
	public double getRateOfInterest() {
		return 5.0; // 5% interest for Platinum Account
	}
}

public class BankExample {
	public static void main(String[] args) {
		BankAccount gold = new GoldAccount();
		BankAccount platinum = new PlatinumAccount();

		System.out.println("Gold Account Interest Rate: " + gold.getRateOfInterest() + "%");
		gold.onlineBankingFeature();

		System.out.println("Platinum Account Interest Rate: " + platinum.getRateOfInterest() + "%");
		platinum.onlineBankingFeature();
	}
}
