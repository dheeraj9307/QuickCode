/*
METHOD-OVERLOADING:
If we created more than one method with the same name in the same class provided, they have different number of arguments or different type of arguments is known as method-overloading.
Or
Two or more methods(multiple methods)have the same name, in a same class, but passing the parameter should be different
means different number of arguments or type of arguments is known as method overloading.
Or
When two or more methods have the same name in the same class but with
different parameters — either in number or type — it is known as method overloading.
 */
package dheeraj.oppsconcepts.polymorphism;
class Printer {
    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    void print(int number) {
        System.out.println("Printing number: " + number);
    }

    void print(String text, int copies) {
        System.out.println("Printing " + copies + " copies of: " + text);
    }
}

public class TestOverload {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello");
        p.print(100);
        p.print("Report", 3);
    }
}
