// Day 14: Java Class Practice – Encapsulation, Methods, and Object Usage

import java.util.Scanner;

// CLASS RECTANGLE
class Rectangle {
    private int length;
    private int breadth;

    // Input method to set values
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        breadth = sc.nextInt();

        if (length <= 0 || breadth <= 0) {
            System.out.println("Invalid input. Length and Breadth set to 1.");
            length = 1;
            breadth = 1;
        }
        // Do not close Scanner to avoid System.in being closed
    }

    // Method to calculate and return area
    public int area() {
        return length * breadth;
    }

    // Method to calculate and return perimeter
    public int perimeter() {
        return 2 * (length + breadth);
    }

    // Method to display rectangle info
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    // Method to check if square
    public boolean isSquare() {
        return length == breadth;
    }
}

public class Java_14_ClassPractice {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.getData();
        r.display();

        if (r.isSquare()) {
            System.out.println("This is a Square.");
        } else {
            System.out.println("This is a Rectangle.");
        }
    }
}
