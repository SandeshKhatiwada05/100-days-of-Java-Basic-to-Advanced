// Day 25: Java Interface – Implementing Interfaces in Classes

// Interface
interface Animal {
    void sound(); // abstract method
    void type();
}

// Implementing class 1
class Dog implements Animal {
    public void sound() {
        System.out.println("🐶 Dog barks: Woof Woof");
    }

    public void type() {
        System.out.println("Type: Domestic Animal");
    }
}

// Implementing class 2
class Lion implements Animal {
    public void sound() {
        System.out.println("🦁 Lion roars: Roaaar");
    }

    public void type() {
        System.out.println("Type: Wild Animal");
    }
}

public class Java_25_Interface {
    public static void main(String[] args) {
        // Interface reference for Dog
        Animal dog = new Dog();
        dog.type();
        dog.sound();

        System.out.println();

        // Interface reference for Lion
        Animal lion = new Lion();
        lion.type();
        lion.sound();
    }
}
