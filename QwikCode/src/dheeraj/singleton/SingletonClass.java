/*
 -We design the class in such that only one object of that class at most can be created. 
✅ Steps to Create a Singleton Class in Java
Step 1: Create a private static reference variable of the class
This holds the only object of the class.
Step 2: Make the constructor private
This ensures no one can create the object using new from outside the class.
Step 3: Provide a public static method to return the instance
This method is used to get the only instance. 
It ensures the object is created only once (lazy initialization).
Note: if you're creating a singleton for a class, 
the reference variable should be of the same class type — because you want to create and control 
only one instance of that class.
 */
package dheeraj.singleton;

public class SingletonClass {
	
	private static SingletonClass s1=null;
	private SingletonClass() {
		
		
	}
	public static SingletonClass getInstance() {
		
		if(s1==null) {
			s1= new SingletonClass();
		}
		return s1;
		
	}
	public static void main(String[] args) {
		SingletonClass s1= SingletonClass.getInstance();
		SingletonClass s2=SingletonClass.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);
	}

}
