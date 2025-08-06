// Day 28: Java Static and Final – Data, Methods & Classes

final class Constants {
    // final class cannot be inherited
    static final double PI = 3.14159; // static and final variable (constant)

    static void showPI() {
        System.out.println("PI value is: " + PI);
    }

    final void greet() {
        System.out.println("Hello from final method inside a final class!");
    }
}

class MathOperations {
    static int counter = 0; // shared by all objects

    static void incrementCounter() {
        counter++;
    }
}

public class Java_28_StaticFinal {
    public static void main(String[] args) {
        // Accessing static final variable and method from final class
        Constants.showPI();
        Constants c = new Constants();
        c.greet();

        // Working with static variable
        MathOperations.incrementCounter();
        MathOperations.incrementCounter();
        System.out.println("Counter value: " + MathOperations.counter);

        // Trying to change final variable – Uncommenting below line causes error
        // Constants.PI = 3.14;  // Error: cannot assign a value to final variable
    }
}
