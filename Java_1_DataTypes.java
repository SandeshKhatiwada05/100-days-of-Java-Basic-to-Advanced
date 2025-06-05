// Day 1: Java Data Types Example

public class Java_1_DataTypes {
    // Integer type - stores whole numbers
    int a = 5;

    // Floating-point type - stores decimal numbers (must end with 'f' or 'F')
    float b = 5.5f;

    // Character type - stores a single character
    char c = 'J';

    // Boolean type - stores true or false values
    boolean isJavaFun = true;

    // Double type - stores large decimal numbers with more precision
    double pi = 3.1415926535;

    // Long type - stores large whole numbers
    long bigNumber = 123456789L;

    // Byte and Short types - smaller integer types
    byte smallByte = 100;
    short shortNumber = 32000;

    public static void main(String[] args) {
        // Create an object to access instance variables
        Java_1_DataTypes example = new Java_1_DataTypes();

        // Print all the values
        System.out.println("Integer (int): " + example.a);
        System.out.println("Float (float): " + example.b);
        System.out.println("Character (char): " + example.c);
        System.out.println("Boolean (boolean): " + example.isJavaFun);
        System.out.println("Double (double): " + example.pi);
        System.out.println("Long (long): " + example.bigNumber);
        System.out.println("Byte (byte): " + example.smallByte);
        System.out.println("Short (short): " + example.shortNumber);
    }
}
