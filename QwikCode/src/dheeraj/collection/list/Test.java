package dheeraj.collection.list;

public class Test {
	public static void main(String[] args) {
		try
		{
			System.out.println("Test.main() try..");
			String n1=null;
		    System.exit(0);
		//	n1.length();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Test.main() catch");
			//e.printStackTrace();
		}
		finally {
			System.out.println("Test.main() finally");
		}
	}

}
