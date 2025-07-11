/*
✅ Steps to Achieve Full Encapsulation in Java:
1️	Make all variables (fields) private to hide them from outside the class (Data Hiding)
2️	Provide public getter and setter methods to access and modify the fields in a controlled way
3️	Add validation logic (optional but best practice) in setter methods to prevent invalid data
4️	Keep class behavior (methods) and data (fields) together — i.e., everything related is inside one class
5️   Avoid direct access to fields from outside — access must go through methods only
Data Hiding:
If you make a variable private, it's called Data Hiding.
And when you provide public getter and setter methods to access and modify the value, you’re allowing
controlled access to that hidden data.
Difference:
You can have data hiding without full encapsulation, but you cannot have proper encapsulation without data hiding.
Example: Data Hiding without Full Encapsulation(Not full/strong encapsulation)
In this the password is hidden but there’s no control or validation — you can set any value.
 */
package dheeraj.oppsconcepts.encapsulation;

public class DataHidingUser {
	 private String password;  // data hiding

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;  // no validation, no control
	    }
	    public static void main(String[] args) {
	    	DataHidingUser user = new DataHidingUser();

	        // Setting password without validation
	        user.setPassword("123");  // weak password, but allowed
	        System.out.println("Password set to: " + user.getPassword());

	        // Setting an empty password - no restriction here
	        user.setPassword("");
	        System.out.println("Password set to: '" + user.getPassword() + "'");
	    }
	}

