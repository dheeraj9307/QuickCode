package dheeraj.iibandsib;

public class SIB1 {
	static {
		 System.out.println("SIB (Static Initialization Block), \n"
	                + "it is created using the static keyword with curly brackets. \n"
	                + "It runs once when the class is loaded, before the main() method.\n"
	                + " It does not require any object creation to run and does not require a calling statement.\n"
	                + "Why Use SIB? To perform one-time setup tasks like loading configuration, connecting to a database, logging, etc.\n"
	                 + "When ever there is SIB in sequence, the first one is going to run first and then the next one. ");
	    }

	static {

		System.out.println("When ever there is SIB in sequence, the first one is going to run first and then the next one. ");
	}

	public static void main(String[] args) {

	}

}
