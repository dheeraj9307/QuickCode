/*
A class without a name, used for one-time use,
it help us to implement an interface or abstract class quickly
 */
package dheeraj.innerclass;

interface MyInterface{
	void show();
}

public class AnonymousInnerClass {
 public static void main(String[] args) {
	 MyInterface obj= new MyInterface() {
		 @Override
		public void show() {
			System.out.println("Anonymous Inner Class !!");
		 }
	 };
	 obj.show();
}
}
