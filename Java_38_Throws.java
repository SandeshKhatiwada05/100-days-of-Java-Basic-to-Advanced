public class Java_38_Throws {
    // throws warns exception for Future
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            divide(6, 0);
        } catch (Exception e) {
            System.out.println("Please Check The Divisor Properly!!");
        } finally {
            System.out.println("ThankyYou!!");
        }

    }
}
