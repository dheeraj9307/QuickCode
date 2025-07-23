/*
Exception:
An Exception is an event that disrupts the normal execution of a program.
Types of Exceptions
Checked Exception:
ClassNotFoundException,IOException,SQLException,FileNotFoundException
Unchecked Exception:
Arithmetic Exception,NullPointerException,ArrayIndexOutBoundException
#Exception In case of METHOD-Overriding: 
1.If Parent1 throws nothing
Parent1 is safe.
✅ Child can throw unchecked exceptions (like ArithmeticException, NullPointerException).
❌ Child cannot throw any checked exception (like IOException) — compiler will give an error.
2. Parent1 throws a checked exception
Example: Parent1 throws IOException
✅ Child can throw:
Same checked exception (IOException)
Subclass (FileNotFoundException)
Unchecked exception (NullPointerException, etc.)
❌ Child cannot throw:
Superclass (Exception, Throwable)
New checked exception not declared by parent (SQLException)
3. Parent1 throws unchecked exception
Example: Parent1 throws RuntimeException
✅ Child can throw:
Same or different unchecked exceptions
❌ Child cannot throw checked exception — parent didn’t declare it.
🔑 Key Line to Speak in Interview:
Checked exceptions follow strict rules — must match or be narrower. Unchecked exceptions are flexible — no restrictions, 
can be thrown anytime.
or
Checked exceptions follow strict rules — the child method can only throw the same or a subclass 
of the parent's checked exception.New or broader checked exceptions are not allowed. 
Note :broader checked exceptions means superclass of the original exception.
Unchecked exceptions (Runtime exceptions) are flexible — no restrictions at all. 
They can be added or removed any-time in child methods 
means 
If I working with unchecked exceptions (like NullPointerException, ArithmeticException, etc.) —
I can:
Add them in the child method
Remove them from the child method
Do both — no compiler error
Note: Exception rules are not applied between overloaded methods.
They are treated as independent methods.
   
 */
package dheeraj.oppsconcepts.polymorphism;

//Base class
class Parent1 {
	// Checked exception declared
	public void show() throws java.io.IOException {
		System.out.println("Parent1 show()");
	}
}

//Case 1: Valid — same checked exception
class Child1 extends Parent1 {
	@Override
	public void show() throws java.io.IOException {
		System.out.println("Child1 show()");
	}
}

//Case 2: Valid — subclass of the checked exception
class Child2 extends Parent1 {
	@Override
	public void show() throws java.io.FileNotFoundException {
		System.out.println("Child2 show()");
	}
}

//Case 3: ❌ Invalid — broader (superclass) checked exception
/*
 * class Child3 extends Parent1 {
 * 
 * @Override public void show() throws Exception { // ❌ Compile-time error
 * System.out.println("Child3 show()"); } }
 */

//Case 4: ❌ Invalid — new checked exception not declared by parent
/*
 * class Child4 extends Parent1 {
 * 
 * @Override public void show() throws java.sql.SQLException { // ❌ Compile-time
 * error System.out.println("Child4 show()"); } }
 */

//Case 5: ✅ Valid — unchecked exception added
class Child5 extends Parent1 {
	@Override
	public void show() throws ArithmeticException {
		System.out.println("Child5 show()");
	}
}

//Case 6: ✅ Valid — no exception thrown in child
class Child6 extends Parent1 {
	@Override
	public void show() {
		System.out.println("Child6 show()");
	}
}

public class MethodOverridingExample1 {
	public static void main(String[] args) {
		try {
			Parent1 p1 = new Child1();
			p1.show();

			Parent1 p2 = new Child2();
			p2.show();

			Parent1 p5 = new Child5();
			p5.show();

			Parent1 p6 = new Child6();
			p6.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
} 
/*
OUTPUT:
Child1 show()
Child2 show()
Child5 show()
Child6 show()
*/
