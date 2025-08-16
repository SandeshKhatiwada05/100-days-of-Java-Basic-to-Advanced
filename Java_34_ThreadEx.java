//QN1: Delay by 200 ms
/*QN2: State (obj.getstate())
       Before ruuning it shows NEW after Running it shows RUNNABLE*/
//QN3: Current Thread sout(Thread.currentthread().getstate());
class QuestionPrac extends Thread {
    @Override
    public void run() {
        while (true) {
            // Sleep function inside try catch
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

class QuestionPrac1 extends Thread {
    @Override
    public void run() {
        while (true) {
            // Sleep function inside try catch
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("I am Here!");
        }
    }
}

public class Java_34_ThreadEx {
    public static void main(String[] args) {
        QuestionPrac q1a = new QuestionPrac();
        QuestionPrac1 q1b = new QuestionPrac1();
        q1a.start();
        q1b.start();
    }
}
