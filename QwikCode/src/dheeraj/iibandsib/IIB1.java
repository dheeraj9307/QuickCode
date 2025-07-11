package dheeraj.iibandsib;

public class IIB1 {
	{
		System.out.println("IIB always executes before the constructor");
		System.out.println("It is executed every time an object is created.");
	}
	IIB1(){
		System.out.println("Constructor will execute !!");
	}
   public static void main(String[] args) {

	   IIB1 iib=new IIB1();
}
}
