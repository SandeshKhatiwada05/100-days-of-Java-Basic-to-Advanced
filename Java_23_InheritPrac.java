//Problem Number 1
class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    int height;

    Cylinder(int height, int radius) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

public class Java_23_InheritPrac {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(20, 10);
        System.out.println("Area of Circle is " + obj.area());
        System.out.println("Volume of Cyclinder is " + obj.volume());

    }
}
