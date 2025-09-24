package Threads;

class Counterr {
    int count = 0;

    // synchronized method to prevent race condition
    public synchronized void increment() {
        count++;
    }
}

class MyThread1 extends Thread {
    Counterr counter;

    MyThread1(Counterr counter) {
        this.counter = counter; // use shared object
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class MyThread2 extends Thread {
    Counterr counter;

    MyThread2(Counterr counter) {
        this.counter = counter; // use shared object
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counterr counter = new Counterr();

        MyThread1 t1 = new MyThread1(counter);
        MyThread2 t2 = new MyThread2(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count); // should be 2000
    }
}
