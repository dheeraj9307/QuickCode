/*
In method overriding, the return type in the child class can be the same as the parent method
OR a subclass of the parent method’s return type — this is called a covariant return type.
Vehicle is the parent class.
Car is the subclass and overrides getVehicle() method.
Return type in parent: Vehicle, and in child: Car → ✅ Covariant Return Type

 */

package dheeraj.oppsconcepts.polymorphism;

class Vehicle {
    Vehicle getVehicle() {
        System.out.println("Returning Vehicle");
        return new Vehicle();
    }
}

class Car extends Vehicle {
    @Override
    Car getVehicle() {
        System.out.println("Returning Car");
        return new Car();
    }

    void drive() {
        System.out.println("Car is driving");
    }
}

public class CovariantReturnDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.getVehicle();  // Output: Returning Vehicle

        Car c1 = new Car();
        c1.getVehicle();  // Output: Returning Car

        // Runtime polymorphism with covariant return
        Vehicle ref = new Car();  // Upcasting
        Vehicle result = ref.getVehicle();  // Output: Returning Car
        System.out.println("Returned class: " + result.getClass().getSimpleName());  // Car
    }
}
/*
result.getClass().getSimpleName()
This line of code returns the class name of the object stored in the result variable at runtime,
without the package name.
 */