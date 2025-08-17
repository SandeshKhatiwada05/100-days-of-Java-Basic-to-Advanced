public class Java_35_TryCatch {
    public static void main(String[] args) {
        int a = 25;
        int b = 0;
        try {
            System.out.println("Division is " + a / b);
        } catch (Exception e) {
            System.out.print("Couldn't Divided because: ");
            System.out.println(e);
        }
        System.out.println("Program Ends!!");
    }
}
