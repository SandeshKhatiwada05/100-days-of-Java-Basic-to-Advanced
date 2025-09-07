import java.util.Calendar;
import java.util.TimeZone;

public class Java_45_Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);// Gives Complete Informtaion till the date
        System.out.println();

        System.out.println(c.getTime());// Same as done by date class

        // System.out.println(c.getTimeZone());
        System.out.println(c.getCalendarType());

        // Date/Time etc
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE));

        // To change Timezone
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kathmandu"));
        System.out.println(c2.getTime());

    }
}
