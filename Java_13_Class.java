// Day 13: Java Classes and Objects – Defining and Using Custom Class

class Person {
    int id;
    String name;

    void printdetails() { // Method inside class
        System.out.println("Name is " + name);
        System.out.println("Id is " + id);
    }
}

public class Java_13_Class {
    public static void main(String[] args) {
        // Creating object of Person class
        Person obj = new Person();
        obj.id = 123;
        obj.name = "Sandesh";
        obj.printdetails();
    }
}
