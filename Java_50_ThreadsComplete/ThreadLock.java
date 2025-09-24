package Threads;

import java.lang.Override;

public class ThreadLock {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread th1 = new Thread(thread1);
        Thread th2 = new Thread(thread1);

        //start the thred
        th1.start();
        th2.start();

        //thread
        th1.join();
        th2.join();

    }
}

class Counter {
    public int count = 0;

    //Method with intrinsic lock
    public synchronized void increment() {
        count++;
        System.out.println("Thread " + Thread.currentThread().getName() + " " + count);
    }

    public int getCount() {
        return count;
    }
}

class Thread1 implements Runnable {
    Counter counter = new Counter();

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            counter.increment();
        }
    }
}

