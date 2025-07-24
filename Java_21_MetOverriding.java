class Base1_ {
    public void method1() {
        System.out.println("I am Method 1");
    }

    public void method2() {
        System.out.println("I am Method 2");
    }
}

class Derived1 extends Base1_ {
    @Override // shows overriding process is correct
    public void method2() {
        System.out.println("I am Overridden of Method 2 i.e Method 3");
    }

    public void method3() {
        System.out.println("I am Last method");
    }
}

public class Java_21_MetOverriding {
    public static void main(String[] args) {
        Base1_ base = new Base1_();
        base.method2();
        Derived1 obj = new Derived1();
        obj.method2();

    }
}
