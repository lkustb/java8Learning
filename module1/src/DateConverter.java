import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * Created by Kwen on 2016/1/9.
 */
public class DateConverter {
//sdfds
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("currentDate : "+ currentDate);

        LocalDate currentDateNew = LocalDate.now();
        System.out.println("currentDateNew : "+  currentDateNew);


        LocalTime   currentLocalTime = LocalTime.now();
        System.out.println("currentLocalTime : "+  currentLocalTime);

//            LocalDate nowDate = LocalDate.now();
//            LocalDate then = nowDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
//
//
//            LocalTime now = LocalTime.now();
//            LocalTime currentTime = LocalTime.of(13, 23);
//            LocalTime tommorrow = currentTime.plusHours(12);



    }
}
