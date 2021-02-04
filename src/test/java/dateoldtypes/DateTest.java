package dateoldtypes;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    @Test
    public void testDate() throws ParseException{
    Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()); //unix epoch

        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,10,10);
        System.out.println(calendar.getTime());
        calendar.set(18,10,10);
        System.out.println(calendar.getTime());

        // DateFormat dateFormat = new SimpleDateFormat("dd hh:mm:ss"); //java.text.ParseException:
        // DateFormat dateFormat = new SimpleDateFormat("MM-dd hh");   //java.text.ParseException:
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd hh");
        date = dateFormat.parse("2010-10-10 10:10:23");
        System.out.println(date);

        String s = dateFormat.format(new Date());
        System.out.println(s);
    }
}
