/*
catch (Exception e){}:
Exception has a broader scope because it is the parent of all unchecked exceptions, 
such as ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException etc. 
If I catch Exception first, the specific catch blocks become unreachable.
 */
package dheeraj.exceptionhandling;

public class MultipleCatchExample {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		} catch (Exception e) {
			System.out.println("General Exception occurred");
		}
	}

}
//OUTPUT: Arithmetic Exception occurred
