// Day 12: Java Revision – Functions, Loops, Recursion, and Patterns

public class Java_12_Revision {

    // Problem 1: Multiplication Table
    static void multiply(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf(n + " * " + i + " = " + n * i + "\n");
        }
    }

    // Problem 2: Pattern
    // *
    // * *
    // * * *
    // * * * *
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Problem 3: Factorial (Revision from Day 11)
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Problem 4: Check Prime Number
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Problem 5: Sum of Digits (e.g., 1234 → 1+2+3+4 = 10)
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication Table of 10:");
        multiply(10);

        System.out.println("\nPattern of 4 rows:");
        pattern(4);

        System.out.println("\nFactorial of 5: " + factorial(5));

        System.out.println("\nIs 17 prime? " + isPrime(17));
        System.out.println("Is 18 prime? " + isPrime(18));

        System.out.println("\nSum of digits of 1234: " + sumOfDigits(1234));
    }
}
