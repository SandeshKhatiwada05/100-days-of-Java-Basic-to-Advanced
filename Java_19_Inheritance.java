// Day 19: Java Inheritance – Using extends with Constructor and Base Class Methods

// Base class
class Animal {
    String name;
    int age;

    // Method to set information
    public void takeinfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void showinfo() {
        System.out.println("Name of Animal: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Derived class using inheritance
class Cow extends Animal {
    int price;

    // Constructor
    Cow() {
        System.out.println("🐄 Cow Object Created");
        System.out.println("💰 Price of a cow is generally above 1 lakh");
    }
}

// Main class
public class Java_19_Inheritance {
    public static void main(String[] args) {
        Cow obj = new Cow();                         // Constructor runs
        obj.takeinfo("Mahan", 5);                    // Inherited method
        obj.showinfo();                              // Inherited method
    }
}
