// Day 5: Switch Case Statements in Java (Traditional & Enhanced Syntax)

public class Java_5_Cases {

    public static void main(String[] args) {
        int day = 2;

        // ✅ Approach 1: Traditional switch-case syntax (Java 7 and earlier)
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Find out yourself");
                break;
        }

        // ✅ Approach 2: Enhanced switch syntax (Java 14+)
        day = 3;
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            default -> System.out.println("Find yourself, bro");
        }
    }

    // 🔍 Note:
    // In Java, we use `while(true)` instead of `while(1)` like in C/C++.
}
