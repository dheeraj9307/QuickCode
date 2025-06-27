package dheeraj.iibandsib;

public class IIB3 {
	{
 		
		System.out.println("IIB (Instance Initialization Block), it  is defined using curly brackets {} without any keyword. It is executed every time an object is created.\r\n"
				+ "The number of times you create an object, the same number of times the IIB will run.\r\n"
				+ "It can initialize both static and non-static variables, but it is mainly used for non-static (instance) variables.\r\n"
				+ "IIB always executes before the constructor, as it initializes instance (non-static) variables before they are assigned to the object.\r\n"
				+ "    • E-commerce or POS systems where every order has some default value. ");	
		}
	  public static void main(String[] args) {
		IIB3 iib =new IIB3();
	  }
}
