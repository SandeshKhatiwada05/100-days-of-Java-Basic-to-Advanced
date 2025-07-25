class Phone {
    public void getphone() {
        System.out.println("Hello! I am a Phone!!");
    }

    public void display() {
        System.out.println("I am Part 1");
    }
}

class Smartphone extends Phone {
    public void getsmartphone() {
        System.out.println("Namaskar!!");
    }

    @Override
    public void display() {
        System.out.println("I am Overloaded Display!");
    }
}

public class Java_22_DynamicMethodDispatch {
    public static void main(String[] args) {
        // Reference of Superclass and object of Subclass
        Phone obj = new Smartphone();
        obj.display();
        // obj.getsmartphone();

    }
}
