import java.util.Date;

public class Java_44_Date {
    public static void main(String[] args) {
        // Millisecond counted from 1st Jan 1970
        System.out.println(System.currentTimeMillis());

        // Date Class
        Date d = new Date();
        System.out.println(d);

        // Time
        System.out.println(d.getTime());// SAME AS DONE IN .CURRENTTIMEMILLIS

    }
}
