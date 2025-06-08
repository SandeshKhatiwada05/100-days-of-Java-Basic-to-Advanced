// Day 4: Conditional Statements, Unary Operators, and Logical Operators in Java

// import java.util.Scanner;

public class Java_4_Conditions {

    public static void main(String[] args) {

        // Unary increment operator with integers
        int y = 7;
        int x = ++y + 8; // y becomes 8, then x = 8 + 8 = 16
        System.out.println("Value of x is " + x); // Output: 16

        // Unary increment operator with characters
        char ch = 'a';
        System.out.println("Next character after 'a' is: " + ++ch); // Output: 'b'

        // Conditional Statements Example
        // (You can uncomment below lines to take input from user)
        /*
        System.out.print("Enter Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        */

        int age = 20; // Hardcoded for demo
        if (age < 18) {
            System.out.print("Sorry!! You can't drive");
        } else if (age >= 90) {
            System.out.println("It's not safe for you to drive");
        } else {
            System.out.println("You can drive!!");
        }

        // Logical Operators
        System.out.println("true AND false = " + (true && false));   // false
        System.out.println("false OR true = " + (false || true));   // true
        System.out.println("true XOR true = " + (true ^ true));     // false
        System.out.println("NOT true = " + (!true));                // false
    }
}
