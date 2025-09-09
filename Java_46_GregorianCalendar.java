import java.util.GregorianCalendar;

public class Java_46_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();

        // Checks Leap Year
        System.out.println(g.isLeapYear(2023));

        System.out.println(g.getFirstDayOfWeek());

        // System.out.println(g.getTimeZone().getAvailableIDs()[0]);
    }
}
