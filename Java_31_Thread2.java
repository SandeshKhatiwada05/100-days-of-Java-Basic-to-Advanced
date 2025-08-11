class MyThread implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Thread 1 Firing");
            i++;
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Thread 2 Firing!!!");
            i++;
        }
    }
}

public class Java_31_Thread2 {
    public static void main(String[] args) {
        // for thread 1
        MyThread bullet = new MyThread();
        Thread gun = new Thread(bullet);

        // for thread 2
        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        // Accessing
        gun.start();
        gun2.start();

    }
}
