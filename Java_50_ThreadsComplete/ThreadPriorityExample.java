package Threads;

class MyRunnablee implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread (Priority " + Thread.currentThread().getPriority() + "): " + i);
            try { Thread.sleep(400); } catch (InterruptedException e) {}
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread subclass (Priority " + getPriority() + "): " + i);
            try { sleep(400); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnablee());
        MyThread t2 = new MyThread();

        // Set priorities (1 - MIN_PRIORITY, 5 - NORM_PRIORITY, 10 - MAX_PRIORITY)
        t1.setPriority(Thread.MIN_PRIORITY);      // Priority 1 (lowest)
        t2.setPriority(Thread.MAX_PRIORITY);      // Priority 10 (highest)
        t2.setPriority(9);
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // Main thread priority 5 (default)

        System.out.println("Runnable Thread priority: " + t1.getPriority());
        System.out.println("Thread subclass priority: " + t2.getPriority());
        System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());

        t1.start();
        t2.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread (Priority " + Thread.currentThread().getPriority() + "): " + i);
            try { Thread.sleep(400); } catch (InterruptedException e) {}
        }
    }
}
