/*
Lambdas Expression:
A lambda expression is a short block of code that provides a clear and concise way to implement a functional interface.
It is especially useful in collection operations, Stream API, and event handling.
Example: (a, b) -> a + b The left side (a, b) represents the input parameters, and the right side a + b is the logic or return value.
Condition to use Lambda Expressions in Java:
Lambda expressions can only be used when a Functional Interface is expected.
A Functional Interface is an interface that has exactly one abstract method.
(Example: Runnable, Comparator<T>, Consumer<T>, Function<T, R>, etc.)
 */
package dheeraj.java8lambdaExpression;

interface Calculator{

	int add(int a,int b);
}

class LambdaExample{
    public static void main(String[] args) {
        Calculator sum=(a,b)->a+b;
        System.out.println("Sum of number is :"+ sum.add(10,11));
    }
}

//output:Sum of number is :21