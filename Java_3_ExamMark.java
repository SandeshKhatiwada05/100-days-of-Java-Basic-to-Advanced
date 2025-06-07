// Day 3: Calculate Total and Average Marks (Percentage) using Classes and Scanner

import java.util.Scanner;

public class Java_3_ExamMark {

    // Subject class holds total marks and obtained marks for a subject
    public static class Subject {
        int total = 100;  // Total marks for each subject
        int obt;          // Obtained marks
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Subject objects for each subject
        Subject s1 = new Subject();
        System.out.print("Enter Mark of Maths: ");
        s1.obt = sc.nextInt();

        Subject s2 = new Subject();
        System.out.print("Enter Mark of Science: ");
        s2.obt = sc.nextInt();

        Subject s3 = new Subject();
        System.out.print("Enter Mark of another subject: ");
        s3.obt = sc.nextInt();

        // Calculate total obtained marks
        int totalMarks = s1.obt + s2.obt + s3.obt;
        System.out.println("Total marks obtained: " + totalMarks);

        // Calculate percentage
        // Note: total maximum marks = 3 subjects * 100 marks each = 300
        float percentage = (totalMarks / 300.0f) * 100; // Use float division
        System.out.printf("Obtained Percentage is: %.2f%%\n", percentage);

        sc.close();
    }
}
