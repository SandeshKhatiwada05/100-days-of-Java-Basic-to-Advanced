// Day 11: Java Recursion – Calculating Factorial using Recursive Method

public class Java_11_Recursion {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1; // Base condition
        } else {
            return n * factorial(n - 1); // Recursive step
        }
    }

    public static void main(String[] args) {
        int ans = factorial(4); // 4! = 4 × 3 × 2 × 1 = 24
        System.out.println("Factorial is " + ans);
    }
}
