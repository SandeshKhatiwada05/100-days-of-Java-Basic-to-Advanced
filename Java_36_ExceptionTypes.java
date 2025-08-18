//Arithematic Exception, ArrayOutOfBoundException

import java.util.Scanner;

public class Java_36_ExceptionTypes {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 25;
        marks[1] = 10;
        marks[2] = 5;

        System.out.println("Enter Array index for Calculation");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Enter a Number to divide " + marks[index]);
        int num = sc.nextInt();
        sc.close();

        try {
            System.out.println("Division of " + marks[index] + " and " + num + " is " + marks[index] / num);
        }

        // Types of Catch
        // 1. Arithmetic Error Catch
        catch (ArithmeticException e) {
            System.out.print("Divisor might be mistake. Error: ");
            System.out.println(e);
        }

        // 2. Array Out Of Bound
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Invalid. Error: ");
            System.out.println(e);
        }

        // Other General Error
        catch (Exception e) {
            System.out.println("Error Occured. Error: ");
            System.out.println(e);
        }

    }
}
