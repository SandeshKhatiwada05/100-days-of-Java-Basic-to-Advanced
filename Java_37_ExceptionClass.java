import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }

    @Override
    public String toString() {
        return "I am toString()";
    }
}

public class Java_37_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        sc.close();
        try {
            if (a > 9) {
                throw new MyException();
            } else {
                System.out.println("Hello");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }
        // Finally Block
        finally {
            System.out.println("Ends here!");
        }
    }
}
