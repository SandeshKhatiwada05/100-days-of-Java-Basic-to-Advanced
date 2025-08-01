// Day 27: Java Interface Inheritance – Extending Interfaces and Implementing in Class

// Base interface
interface Animal {
    void eat();
}

// Extended interface inherits from Animal
interface Pet extends Animal {
    void play();
}

// Class implements the extended interface (must implement both methods)
class Dog implements Pet {
    public void eat() {
        System.out.println("🐶 Dog is eating food.");
    }

    public void play() {
        System.out.println("🐶 Dog is playing fetch.");
    }
}

public class Java_27_InterfaceInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.play();
    }
}
