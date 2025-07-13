//Java Day 20 Constructor Inheritance
//Parent Class
class Base {
    Base() {
        System.out.println("I am Base Constructor called by Derived(normal one)");
    }

    // Overloaded Constructor
    Base(int x) {
        System.out.printf("I am Overloaded base of value x=%d called by Derived(having argument) \n", x);
    }
    // either one of two constructor perfoms the action
}

// Derived/Child Class
class Derived extends Base {
    Derived() {
        super(3);// To use Base class ko argument wala constructor
        System.out.println("I am Derived Constructor called by Derivedofderived(argument one)!");
    }

    // Derived Overloaded
    Derived(int x, int y) {
        System.out.println("I am Derived overloaded of value in y as:" + y);
    }

    public void show() {
        System.out.println("I don't serve any purpose ;)");
    }
}

// Grandchild Class
class Derivedofderived extends Derived {
    Derivedofderived() {
        super(3, 4);
        System.out.println("I am normal Derivedofderived class");
    }

    // overloading the constructor
    Derivedofderived(int x, int y, int z) {
        System.out.printf("I am derived of derived with x %d, y %d, z %d ", x, y, z);
    }
}

public class Java_20_Constr_Inheritance {
    public static void main(String[] args) {
        System.out.println("Input is: Derivedofderived obj = new Derivedofderived(10, 20, 30);");
        // Derived obj = new Derived();
        Derivedofderived obj = new Derivedofderived(10, 20, 30);

        System.out.println();
        obj.show();
    }
}
