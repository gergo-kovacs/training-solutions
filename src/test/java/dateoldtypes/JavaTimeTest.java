package dateoldtypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class JavaTimeTest {

    @Test
    public void testLocalDateTime(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.of(1120,1,10);
        System.out.println(localDate1);

        System.out.println(LocalDateTime.of(2020,10,2,10,23,10));
        localDateTime = LocalDateTime.of(2020,10,2,10,23,10);
        Assertions.assertEquals("2020-10-02T10:23:10",localDateTime.toString());
        localDate = localDate.plusDays(1).plusMonths(2);
        Assertions.assertEquals("2021-04-05",localDate.toString());
    }

    @Test
    public void testConvert(){
        LocalDate localDate = LocalDate.of(2020,10,1);
        LocalTime localTime = LocalTime.of(10,30);

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        Assertions.assertEquals("2020-10-01T10:30",localDateTime.toString());
    }

    @Test
    public void testJavaUtilDate(){
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(),ZoneId.of("GB"));
        System.out.println(localDateTime);
    }

    @Test
    public void testChronoUnit(){
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,11,10,10,0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2020,11,10,11,0);
        Assertions.assertEquals(1,ChronoUnit.HOURS.between(localDateTime1,localDateTime2));
    }

    @Test
    public void testFormat(){
        LocalDateTime localDateTime = LocalDateTime.of(2020,5,3,10,0);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String s = localDateTime.format(dateTimeFormatter);
        System.out.println(s);


        s = localDateTime.format(DateTimeFormatter.ofPattern("yy-MM-dd").withLocale(Locale.CANADA));
        System.out.println(s);
    }


}
