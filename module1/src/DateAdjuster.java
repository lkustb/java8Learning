import javax.xml.bind.SchemaOutputResolver;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * Created by Kwen on 2016/1/9.
 */
public class DateAdjuster {

    public static void main(String[] args) {
        LocalDate nowTime = LocalDate.now();
        LocalDate then = nowTime.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));


        LocalTime now = LocalTime.now();
        LocalTime currentTime = LocalTime.of(23, 23);
        LocalTime tommorrow = currentTime.plusHours(12);

        System.out.println(then);


        System.out.println(currentTime);

        System.out.println(tommorrow);


        Set<String>  allZoneIds = ZoneId.getAvailableZoneIds();

        String ukTZ = ZoneId.of("Europe/London").toString();

        System.out.println("ukTZ : " + ukTZ);


        ZonedDateTime currentMeeting = ZonedDateTime.of(
                LocalDate.of(2014, Month.MARCH, 12),
                LocalTime.of(9, 30),
                ZoneId.of("Europe/London")
        );

        ZonedDateTime nextMetting = currentMeeting.plus(Period.ofWeeks(1));

        ZonedDateTime nextMettingUS = nextMetting.withZoneSameInstant(ZoneId.of("US/Central"));


        System.out.println("nextMetting : " + nextMetting);

        System.out.println("nextMettingUS : " + nextMettingUS);


        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(nextMettingUS));

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(nextMettingUS));



    }
}
