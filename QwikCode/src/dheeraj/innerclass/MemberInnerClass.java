/*Member Inner Class:
A class defined inside another class without static keyword.
Example: Member Inner Class (non-static)
 */
package dheeraj.innerclass;

public class MemberInnerClass {
	 class MemberIC{
		 void show() {
			 System.out.println("This is my Inner !! Class !!");
		 }
	 }
	 public static void main(String[] args) {
		 MemberInnerClass member=new MemberInnerClass();
		 MemberInnerClass.MemberIC memb=  member.new MemberIC();
		 memb.show();
	}


}
