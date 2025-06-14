// Day 9: Advanced Method Overloading – Type Promotion, Varargs, and Object Parameters

public class Java_10_AdvancedOverloading {

    // No parameter
    static void greet() {
        System.out.println("Hello, world!");
    }

    // One integer
    static void greet(int times) {
        System.out.println("Hello repeated " + times + " times:");
        for (int i = 1; i <= times; i++) {
            System.out.println("  Hello #" + i);
        }
    }

    // One double (type promotion)
    static void greet(double d) {
        System.out.println("You passed a double: " + d);
    }

    // Two parameters
    static void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    // Varargs - accepts multiple names
    static void greet(String... names) {
        System.out.println("Hello to all:");
        for (String name : names) {
            System.out.println("  - " + name);
        }
    }

    // Object as parameter
    static void greet(Student student) {
        System.out.println("Hi " + student.name + ", your roll is " + student.roll);
    }

    public static void main(String[] args) {
        greet();                             // No arguments
        greet(3);                            // int
        greet(3.14);                         // double
        greet("Alice", 22);                  // String and int
        greet("Bob", "Charlie", "Diana");    // Varargs
        greet(new Student("Elon", 101));     // Object
    }
}

// Supporting class
class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

