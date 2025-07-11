/*
Real life example of IIB E-commerce where every order has some default value.
In an e-commerce application (like Amazon, Flipkart), every order should have a default discount of 10% — unless specified otherwise.
Now, if I have multiple constructors (for different order types), I don't want to write the same discount = 10 logic in all of them — it leads to code duplication.
This is where IIB becomes useful: one place to write common logic.
 */
package dheeraj.iibandsib;

public class Order {
	 int discount;

	    // ✅ Instance Initialization Block (IIB)
	    {
	        discount = 10; // common setup for all orders
	        System.out.println("IIB: Default discount set to " + discount + "%");
	    }

	    public Order() {
	        System.out.println("Default order created");
	    }

	    public Order(String product) {
	        System.out.println("Order created for: " + product);
	    }

	    public static void main(String[] args) {
	        Order o1 = new Order();            // Normal order
	        Order o2 = new Order("Laptop");    // Product-specific order
	    }
}
