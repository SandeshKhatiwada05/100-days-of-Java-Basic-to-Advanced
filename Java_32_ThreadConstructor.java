class MyThread11 extends Thread {
    MyThread11(String name) {
        super(name);
    }

    public void run() {
        System.out.println("I am Process");
    }
}

class MyThread22 implements Runnable {
    MyThread22(Runnable th) {
        super();
    }

    public void run() {
        System.out.println("I am Process of Runnable");
    }
}

public class Java_32_ThreadConstructor {
    public static void main(String[] args) {
        MyThread11 obj = new MyThread11("Sandesh");
        obj.start();
        System.out.println(obj.getName());

        // Using Runnable
        MyThread22 obj2 = new MyThread22(() -> System.out.println("I am Happy"));
        Thread th = new Thread(obj2);
        th.start();
        th.getName();

    }
}
