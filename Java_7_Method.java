// Day 7: Methods in Java – Static and Non-Static Methods

public class Java_7_Method {

    // ✅ A method is a function written inside a class in Java.
    // Since Java is object-oriented, we call functions as "methods".

    // Static method: can be called without creating an object
    static int add(int a, int b) {
        return (a + b);
    }

    // Non-static method: requires an object to be invoked
    int callmethod() {
        int a = 7;
        return a;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // Calling static method directly
        int x = add(a, b);
        System.out.println("Sum using static method: " + x);

        // Calling non-static method using object
        Java_7_Method obj = new Java_7_Method();
        System.out.println("Value returned from non-static method: " + obj.callmethod());
    }
}
