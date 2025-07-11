/*
CLASS: Class -blueprint or template.
Class is a blueprint or template in Java.
It defines the structure of objects by including fields (variables), methods, and constructors.
Using this blueprint, we can create multiple objects with similar properties and behavior.
OBJECT: An object is a real instance(result) of a class.
It is created using the new keyword and can access the class's fields and methods.
 */
package dheeraj.oppsconcepts.classandobject;

public class Mobile {
	 String brand;
     String color;
     int price;

     public Mobile(String brand, String color, int price) {
    	 this.brand=brand;
    	 this.color=color;
    	 this.price=price;

     }
     public void showDetails() {
    	 System.out.println("Mobile brand is :" +brand + " With color "+color+" and price is :"+price);
     }
     public static void main(String[] args) {
    	 Mobile mobile=new Mobile("Samsung","Gray",18000);
    	 mobile.showDetails();
	}



}
