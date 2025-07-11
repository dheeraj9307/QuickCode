/*
CLASS: Class -blueprint or template.
Class is a blueprint or template in Java.
It defines the structure of objects by including fields (variables), methods, and constructors.
Using this blueprint, we can create multiple objects with similar properties and behavior.
OBJECT: An object is a real instance(result) of a class.
It is created using the new keyword and can access the class's fields and methods.
 */
package dheeraj.oppsconcepts.classandobject;

public class Car {
 //fields
  String brand;
  String color;
  int speed;

  //Constructor (to initialize object data)
  Car(String brand, String color,int speed){
	  this.brand=brand;
      this.color=color;
      this.speed=speed;
  }
  // Method (behavior)
  void drive() {
	  System.out.println(color + " " +brand+ "is driving at :" + speed +"km/h");
  }
  public static void main(String[] args) {
	  Car car1 = new Car("Honda", "Red", 120);
      Car car2 = new Car("BMW", "Black", 150);
      Car car3 = new Car("Hyundai", "White", 100);

      car1.drive();  // Output: Red Honda is driving at 120 km/h
      car2.drive();  // Output: Black BMW is driving at 150 km/h
      car3.drive();  // Output: White Hyundai is driving at 100 km/h
}

}
