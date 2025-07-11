/*
✅ Steps to Achieve Full Encapsulation in Java:
1️	Make all variables (fields) private to hide them from outside the class (Data Hiding)
2️	Provide public getter and setter methods to access and modify the fields in a controlled way
3️	Add validation logic (optional but best practice) in setter methods to prevent invalid data
4️	Keep class behavior (methods) and data (fields) together — i.e., everything related is inside one class
5️   Avoid direct access to fields from outside — access must go through methods only
Difference:
You can have data hiding without full encapsulation, but you cannot have proper encapsulation without data hiding.
Example: Proper Encapsulation (Includes Data Hiding)
In this example, the password is hidden and access is controlled using validation.
You cannot set any invalid value directly — only valid values are accepted.
*/
package dheeraj.oppsconcepts.encapsulation;

public class DataHidingUser1 {
	 private String password;  // data hiding

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        if (password == null || password.length() < 6) {
	            System.out.println("Password must be at least 6 characters.");
	        } else {
	            this.password = password;
	            System.out.println("Password set successfully.");
	        }
	    }

	    public static void main(String[] args) {
	        DataHidingUser1 user = new DataHidingUser1();

	        user.setPassword("123");        // Invalid - too short
	        user.setPassword("");           // Invalid - empty
	        user.setPassword("mypassword"); // Valid

	        System.out.println("Password: " + user.getPassword());
	    }
	}
/*
Password must be at least 6 characters.
Password must be at least 6 characters.
Password set successfully.
Password: mypassword
  */
