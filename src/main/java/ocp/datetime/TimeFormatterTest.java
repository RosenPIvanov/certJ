package ocp.datetime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by dia on 5.9.2017 г..
 */
public class TimeFormatterTest {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

        System.out.println(d.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
       //exception System.out.println(d.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG/FULL)));

    }
    }
