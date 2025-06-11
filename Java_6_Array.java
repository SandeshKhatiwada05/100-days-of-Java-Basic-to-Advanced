// Day 6: Arrays in Java – Initialization, Looping, Sum, and Sorting

import java.util.Arrays;

public class Java_6_Array {
    public static void main(String[] args) {

        // ✅ 1. Creating an array and initializing selected elements
        int[] array = new int[5];   // Default values will be 0
        array[1] = 23;
        array[2] = 45;
        System.out.printf("array[1] = %d , array[2] = %d\n", array[1], array[2]);

        // ✅ 2. Creating an array with initial values
        int[] marks = { 2, 3, 4, 5, 9 };
        System.out.println("marks[2] = " + marks[2]);
        System.out.println("Length of marks array: " + marks.length);

        // Looping through marks using traditional for loop
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println(); // For newline

        // ✅ 3. Calculating sum of elements using enhanced for loop
        int[] mark = { 12, 3, 4, 5 };
        int sum = 0;
        for (int element : mark) {
            sum += element;
        }
        System.out.println("Sum of elements in 'mark' array: " + sum);

        // ✅ 4. Sorting an array using Arrays.sort()
        System.out.println("Before Sort mark[0] = " + mark[0]);
        Arrays.sort(mark); // Sorts the array in ascending order
        System.out.println("After Sort mark[0] = " + mark[0]);

        // Optional: print the sorted array
        System.out.print("Sorted Array: ");
        for (int value : mark) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
