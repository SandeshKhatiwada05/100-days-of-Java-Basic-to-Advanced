import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_47_Time {
    public static void main(String[] args) {
        // Local Date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getDayOfMonth());

        // Local Time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // Local DateTime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println();

        // Date Formattor
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY --E");
        String myDate = ld.format(df);
        System.out.println(myDate);

        /*
         * DateTime Formatter other options
         * System.out.println();
         * DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;
         * String today = ld.format(df2);
         * System.out.println(today);
         */
    }
}
