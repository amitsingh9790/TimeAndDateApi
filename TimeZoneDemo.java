package TimeAndDateApi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class TimeZoneDemo {
    public static void main(String[] args) {
        ZoneId zi = ZoneId.of("America/New_York");
        LocalTime ld = LocalTime.now(zi);
        System.out.println(ld);

        LocalTime indian_time = LocalTime.now();
        System.out.println(indian_time);

        long l = ChronoUnit.HOURS.between(ld,indian_time);
        System.out.println(l);

    }
}
