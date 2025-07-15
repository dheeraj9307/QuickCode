/*
throw keyword is used to manually throw an exception inside a method
*/
package dheeraj.exceptionhandling;

public class ThrowExample1 {
   static void checkNumber(int number) {
	   if(number<0) {
		   throw new ArithmeticException("Negative Number are not allowed ");
	   }
	   else {
		   System.out.println("Valid Number : " +number);
	   }
   }
   public static void main(String[]args) {
	   try {
		   checkNumber(-6); //This will throw an exception  
	   }
	   catch(ArithmeticException e) {
		   System.out.println("Caught Exception " +e.getMessage());
	   }
	   
   }
}
