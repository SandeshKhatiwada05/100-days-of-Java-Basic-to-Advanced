class MyThread12 extends Thread {
    MyThread12(String name) {
        super(name);
    }

    public void run() {
        while (true)
            System.out.println("I am " + getName());

    }
}

public class Java_33_ThreadPriority {
    public static void main(String[] args) {
        MyThread12 t1 = new MyThread12("Sandesh (Maximum)");
        MyThread12 t2 = new MyThread12("Sandesh 2");
        MyThread12 t3 = new MyThread12("Sandesh 3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        // t1.join()--->It finishes t1 and goes to t2, but needs to be insidetry catch
        t2.start();
        t3.start();

    }
}
