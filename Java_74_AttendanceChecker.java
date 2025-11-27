import java.util.Scanner;

public class Java_49_AttendanceChecker {

    public static String[] name() {
        //String[] names = new String[5];
        String[] names = {"Raj", "Suraj", "Manoj", "Diwash", "Saroj"};
        return names;
    }

    public static void autonamegenerator() {
        String names[] = name();
        int count = 0;
        int abs = 0;
        int nam = name().length;
        for (int i = 0; i < nam; i++) {
            System.out.println();
            System.out.print("Is " + names[i] + " Present? ");
            Scanner sc = new Scanner(System.in);
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("Y") || check.equalsIgnoreCase("YES")) {
                count++;
            } else if (check.equalsIgnoreCase("N") || check.equalsIgnoreCase("NO")) {
                abs++;
            }
        }
        System.out.println("Present Students are " + count);
        System.out.println("Absents are " + abs);
    }

    public static void main(String[] args) {
        //name();
        autonamegenerator();
    }

}
