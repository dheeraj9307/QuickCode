/*
throw keyword is used to manually throw an exception inside a method
*/
package dheeraj.exceptionhandling;

public class ThrowExample2 {
	
	static void checkAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Age can not be Negative");
		}
		else {
			System.out.println("Valid Age :"+ age);
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(-18);	
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught :" +e.getMessage());
		}
	}

}
