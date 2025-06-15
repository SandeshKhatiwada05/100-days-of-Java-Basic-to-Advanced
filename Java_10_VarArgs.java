// Day 10: Java VarArgs – Flexible Argument Handling Without Overloading

public class Java_10_VarArgs {

    /*
     * Instead of writing overloaded methods like:
     *   sum(int a, int b)
     *   sum(int a, int b, int c)
     *   sum(int a, int b, int c, int d)
     * ...we use VarArgs to accept any number of int arguments using:
     *   sum(int... arr)
     */

    static int sum(int... arr) {
        // 'arr' is treated as int[]
        int add = 0;
        for (int a : arr) {
            add += a;
        }
        return add;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Variable Arguments (VarArgs) in Java!");

        // Passing an array
        int[] result = { 1, 2, 3 };
        System.out.println("Sum using array: " + sum(result));

        // Passing directly
        System.out.println("Sum of 1, 2, 3, 4: " + sum(1, 2, 3, 4));
        System.out.println("Sum of just one number 10: " + sum(10));
        System.out.println("Sum of nothing: " + sum()); // returns 0

    }
}
