package oca;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.lang.model.type.NullType;

public class DateTest {

    static String a = "a";
    LocalDate ld2 = LocalDate.now().plus(Period.of(0, 1, 1));

    public static void main(String[] args) {
        System.out.println( ((DateTest) null).a);

        Period.ofDays(1);
        Period.ofWeeks(1);
        Period.ofMonths(1);
        Period.ofYears(1);

        Duration.ofSeconds(1);
        Duration.ofMinutes(1);
        Duration.ofHours(1);
        Duration.ofDays(1);

        LocalDate dt = LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        System.out.println(dt);
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE));
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE_TIME));
        LocalDate ld2 = LocalDate.now().plus(Period.of(0, 1, 1));
        LocalDate ld2LostMonts = LocalDate.now().plus(Period.ofMonths(1).ofDays(1));
        // static methods of Period class. Therefore, Period.ofMonths(1).ofDays(1) will give you a Period of only 1 day.



    }
}
