package org.Sandesh;

// ThreadLab.java
class Counter {
    private int count = 0;

    // synchronized method to ensure thread safety
    public synchronized void increment(String threadName) {
        count++;
        System.out.println(threadName + " incremented count to: " + count);
    }

    public int getCount() {
        return count;
    }
}

// 1. Thread created by extending Thread class
class ExtendsThread extends Thread {
    private Counter counter;

    public ExtendsThread(String name, Counter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            counter.increment(getName());
            try {
                Thread.sleep(100); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 2. Thread created by implementing Runnable interface
class RunnableThread implements Runnable {
    private Counter counter;
    private String name;

    public RunnableThread(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            counter.increment(name);
            try {
                Thread.sleep(100); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadLab {
    public static void main(String[] args) {
        System.out.println("Sandesh Khatiwada\n");
        Counter counter = new Counter();

        // Using extends Thread
        ExtendsThread t1 = new ExtendsThread("Thread-Extends", counter);
        ExtendsThread t2 = new ExtendsThread("Thread-Extends-2", counter);

        // Using implements Runnable
        Thread t3 = new Thread(new RunnableThread("Thread-Runnable", counter));
        Thread t4 = new Thread(new RunnableThread("Thread-Runnable-2", counter));

        // Setting thread priorities
        t1.setPriority(Thread.MAX_PRIORITY);   // highest priority
        t2.setPriority(Thread.MIN_PRIORITY);   // lowest priority
        t3.setPriority(Thread.NORM_PRIORITY);  // normal priority
        t4.setPriority(7);                     // custom priority

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Counter Value: " + counter.getCount());
    }
}

