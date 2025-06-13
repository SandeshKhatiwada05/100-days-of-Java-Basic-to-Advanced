// Day 8: Understanding Java Parameter Passing (Primitive vs Reference Types)

public class Java_8_MethodOverloading {

    // ✅ Method that accepts a primitive type (int)
    static void change1(int a) {
        a = 98;  // Only changes local copy
    }

    // ✅ Method that accepts a reference type (array)
    static void change2(int[] array) {
        array[0] = 98;  // Changes original array content
    }

    public static void main(String[] args) {
        int x = 50;
        change1(x);
        System.out.println("After calling change1, x is still: " + x); // Output: 50

        int[] mark = { 1, 3, 4, 5, 6, 7 };
        change2(mark);
        System.out.println("After calling change2, mark[0] is now: " + mark[0]); // Output: 98

        // 🔍 In Java, primitive types are passed by value (copy), 
        // but objects/arrays are passed by reference (memory address).
    }
}
