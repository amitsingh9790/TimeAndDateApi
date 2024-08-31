package TimeAndDateApi;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

public class TimeAndDateApiDemo {
    public static void main(String[] args) {
        //--- Old Way ---
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String current_Date = sdf.format(d);
        System.out.println("Current Date: "+current_Date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss"); //HH = for 24 hours formate
        String current_Time = sdf2.format(d);
        System.out.println("Current Time: "+current_Time);

        System.out.println("--------------------");

        //--- New Way ---
        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String current_date2 = dtf.format(ld);
        System.out.println("Current Date: "+current_date2);

        String date = "24-Jan-2024";    //first letter of month should be capital else through exception
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate ld2 = LocalDate.parse(date,dtf2);
        System.out.println("Date: "+ld2);

        LocalDate ld3 = LocalDate.now();
        System.out.println(ld3.minusDays(10));

        LocalTime lt= LocalTime.now();
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String current_time = dtf3.format(lt);
        System.out.println("Current Time: "+current_time);




    }
}
