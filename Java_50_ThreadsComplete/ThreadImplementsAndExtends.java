package Threads;


class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class MyThreadd extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread subclass: " + i);
            try { sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadImplementsAndExtends {
    public static void main(String[] args) {
        // Using Runnable
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        // Using Thread subclass
        MyThreadd t2 = new MyThreadd();
        t2.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}



