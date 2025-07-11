/*
A class defined inside another class with static keyword.
It cannot access non-static members of the outer class directly.
 */
package dheeraj.innerclass;

public class StaticNestedClass {
	void sd() {
		System.out.println("this is dheeraj");
	}

     static class StaticNC{
    	  public void show() {
    		  System.out.println("This is static Nested class");
    	  }
      }
     public static void main(String[] args) {
    	 StaticNestedClass.StaticNC snc = new StaticNestedClass.StaticNC();
    	 snc.show();
    	 StaticNestedClass s=new StaticNestedClass();
    	 s.sd();
	}
}
