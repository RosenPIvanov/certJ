package ocp.datetime;

import java.time.*;

/**
 * Created by dia on 6.9.2017 г..
 */
public class InstantTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);

        Instant instant = Instant.now();
      long  epochSeconds = 1;
         Instant.ofEpochSecond(epochSeconds);
       // no C. date.toInstant()
       // no D. dateTime.toInstant()
       // no E. time.toInstant()
        zonedDateTime.toInstant();
    }
}
