/*
Optional Class
Optional<T> is a Java 8 feature that helps avoid NullPointerException by representing the presence or absence of a value.
Real-life Use Case:
When retrieving data from a database, config file, or any source where a value might be null,
wrap it in Optional to handle the case gracefully without writing manual null checks.
Simple Explanation:
In Java, if a method returns null and we try to use it, it causes a NullPointerException (NPE).
To avoid this, Java 8 introduced Optional<T> to safely represent values that may or may not be present.
Here i am using manually with the help of if else i.e. if (value != null)
*/
package dheeraj.java8optionalclass;

class User1 {
	private String name;
	private String email;

	public User1(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Normal getter that may return null
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}
}

public class OptionalExample1 {

	public static void printEmail(User user) {
		if (user.getEmail() != null) {
			System.out.println(user.getName() + "'s Email: " + user.getEmail());
		} else {
			System.out.println(user.getName() + "'s Email: Email not provided");
		}
	}

	public static void main(String[] args) {
		// User with no email
		User user1 = new User("Dheeraj", null);

		// User with email
		User user2 = new User("Patel", "patel@example.com");

		// Print emails safely using null check
		printEmail(user1);
		printEmail(user2);
	}
}
/*
Dheeraj's Email: Optional.empty
Patel's Email: Optional[patel@example.com]

 */
