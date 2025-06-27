import java.util.Scanner;

class Rectangle__ {
    private int length;
    private int breadth;

    // Constructor
    Rectangle__() {
        this.length = 10;
        breadth = 10;
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
    // 1. Area
    public void area() {
        System.out.println("Area of Rectangle is " + length * breadth);
    }

    // 2. Perimeter
    public void perimeter() {
        System.out.println("Perimter of Rectangle is " + 2 * (length + breadth));
    }
}

public class Java_16_Constructor {
    public static void main(String[] args) {
        Rectangle__ obj = new Rectangle__();
        // obj.getdata();
        obj.perimeter();
        obj.area();

    }

}
