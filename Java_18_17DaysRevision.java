import java.util.Scanner;
import java.util.Random;

// Encapsulated Shape class
class Shape {
    private String type;
    private int length;
    private int breadth;

    // Constructor
    public Shape(String type, int length, int breadth) {
        this.type = type;
        this.length = length;
        this.breadth = breadth;
    }

    // Method Overloading – Area Calculation
    public int area() {
        return length * breadth;
    }

    public int area(int base, int height) {
        return (base * height) / 2;
    }

    // Method – Perimeter
    public int perimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Shape Type: " + type);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

public class Java_18_17DaysRevision {

    // Factorial using recursion
    static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    // Method with varargs
    static void printStats(int... values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        System.out.println("Sum of values: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[3];
        int count = 0;

        while (count < shapes.length) {
            System.out.println("\n🎯 Shape Entry (" + (count + 1) + " of 3)");
            System.out.print("Enter shape type (rectangle/triangle): ");
            String type = sc.next();

            int length, breadth;
            System.out.print("Enter length: ");
            length = sc.nextInt();

            System.out.print("Enter breadth: ");
            breadth = sc.nextInt();

            shapes[count] = new Shape(type, length, breadth);
            count++;
        }

        System.out.println("\n📋 Shape Summary:");
        for (Shape s : shapes) {
            s.display();
            System.out.println();
        }

        // Demonstrating switch and conditionals
        System.out.print("Want to calculate factorial of a number? (y/n): ");
        char choice = sc.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.println("Factorial of " + num + " is " + factorial(num));
        } else {
            System.out.println("Skipping factorial!");
        }

        // Demonstrating varargs
        System.out.println("\n📌 Passing 5 numbers to varargs method:");
        printStats(10, 20, 30, 40, 50);

        // Random bonus challenge
        Random rand = new Random();
        int target = rand.nextInt(10);
        int tries = 0;
        int guess;
        System.out.println("\n🎲 Guess the random number between 0-9:");
        do {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            tries++;
        } while (guess != target);
        System.out.println("✅ You guessed it in " + tries + " tries!");

        sc.close();
    }
}
