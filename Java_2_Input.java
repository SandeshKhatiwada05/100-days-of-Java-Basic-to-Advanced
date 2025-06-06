import java.util.Scanner;

public class Java_2_Input {
    // Day 2: Taking User Input in Java using Scanner

    public static void main(String[] args) {
        // Create Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Take String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Take integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Take float input
        System.out.print("Enter your GPA: ");
        float gpa = scanner.nextFloat();

        // Take boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Display the inputs
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Student Status: " + isStudent);

        // Close the scanner (good practice)
        scanner.close();
    }
}

    
