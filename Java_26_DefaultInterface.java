interface Camera2 {
    void takePhoto();

    // To prevent Error we use default, class ma specify garna jaruri chaina
    default void takevideo() {
        System.out.println("Default to Record Videos...");
    }
}

interface CellularDevice2 {
    String[] use4G();
}

class Phone2 {
    void bouncingBallGame() {
        System.out.println("Bouncing Ball Enabled!!");
    }
}

class SmartPhone2 extends Phone2 implements Camera2, CellularDevice2 {
    public void takePhoto() {
        System.out.println("Clicking Photosss...");
    }

    public String[] use4G() {

        System.out.println("Connecting to networks..");
        String[] listss = { "Khatiwada Niwas", "Prayag-Wsbss" };
        return listss;
    }

    // Default can be overriden here
    @Override
    public void takevideo() {
        System.out.println("Overriden for taking Video");
    }
}

public class Java_26_DefaultInterface {
    public static void main(String[] args) {
        SmartPhone2 obj = new SmartPhone2();
        obj.bouncingBallGame(); // Calling method from superclass
        obj.takePhoto();

        // Default
        obj.takevideo();

        String[] show = obj.use4G();
        obj.use4G();
        // To print all arrays
        // To use this loop directly, select foreach given in suggestion
        for (String arr : show) {
            System.out.println(arr);
        }
    }
}
