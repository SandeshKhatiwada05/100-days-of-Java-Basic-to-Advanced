import java.util.Scanner;

class Rectangle_ {
    private int length;
    private int breadth;

    // Constructor in different way
    Rectangle_(int mylength, int mybreadth) {
        length = mylength; // also can be written as this.length = lenght;
        breadth = mybreadth;
    }

    // For constructor Overloading
    Rectangle_() {
        length = 25;
        breadth = 25;
    }

    // Third Constructor- for overloading
    Rectangle_(int mylength) {
        length = mylength; // if breadth is not given in argument
        breadth = 30; // like as before
    }

    // input function
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        breadth = sc.nextInt();
        sc.close();
    }

    // output function
    public void info() {
        System.out.printf("Length is %d. Breadth is %d.\n", length, breadth);
    }

}

public class Java_17_Construct2 {
    public static void main(String[] args) {
        // Using Constructor with parameters
        Rectangle_ obj = new Rectangle_(10, 10);
        obj.info();

        // Constructor Overloading
        Rectangle_ obj1 = new Rectangle_();
        obj1.info();

        // Third Overloading with only Length Given
        Rectangle_ obj2 = new Rectangle_(30);
        obj2.info();

    }

}
