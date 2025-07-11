/*
Optional Class
Optional<T> class is a Java 8 feature. It helps us to avoid NullPointerException by representing the presence or absence of a value.
🔹 Real-life Use Case:
When retrieving data from a database, config file, or any source where a value might be null,
wrap it in Optional to handle the case gracefully without null checks.
or
In Java, if a method returns null and we try to use it, we get a NullPointerException (NPE).
To avoid this, Java 8 introduced Optional<T>.
It helps represent a value that may or may not be present.
 */
package dheeraj.java8optionalclass;

import java.util.Optional;

class User {
	private String name;
	private String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;

	}

	// Getter returns Optional
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public String getName() {
		return name;
	}

}

class OptionalExample {
	public static void printEmail(User user) {
		String email = user.getEmail().orElse("Email not provided");
		System.out.println(user.getName() + "'s Email: " + email);

	}

	public static void main(String[] args) {
		//User with no email (could be from DB or API)
		User user1 = new User("Dheeraj", null);

		// User with email
		User user2 = new User("Patel", "patel@example.com");

		// Safe access using Optional
		printEmail(user1);
		printEmail(user2);
	}

}

/*
Output:
Dheeraj's Email: Email not provided
Patel's Email: patel@example.com

 */
