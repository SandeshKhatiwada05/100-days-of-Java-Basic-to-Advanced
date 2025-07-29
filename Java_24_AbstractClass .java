// Day 24: Java Abstraction – Abstract and Base Class Example

// Abstract Base Class
abstract class Vehicle {
    String brand;

    // Constructor for base class
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no body)
    abstract void startEngine();

    // Concrete method (common for all derived classes)
    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Derived class 1
class Car extends Vehicle {
    public Car(String brand) {
        super(brand); // calling base class constructor
    }

    // Overriding abstract method
    @Override
    void startEngine() {
        System.out.println("🚗 Car engine started with a key!");
    }
}

// Derived class 2
class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("🏍️ Bike engine started with a kick!");
    }
}

public class Java_24_AbstractClass {
    public static void main(String[] args) {
        // Creating Car object
        Vehicle car = new Car("Toyota");
        car.showBrand();
        car.startEngine();

        System.out.println();

        // Creating Bike object
        Vehicle bike = new Bike("Yamaha");
        bike.showBrand();
        bike.startEngine();
    }
}
