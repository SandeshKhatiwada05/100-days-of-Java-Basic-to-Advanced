class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 1000) {
            System.out.println("I am Cooking :(");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 1000) {
            System.out.println("I am Chatting hehe :)");
            i++;
        }
    }
}

public class Java_30_Threads {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        Thread2 obj2 = new Thread2();
        obj.start();
        obj2.start();

    }
}
