package dateoldtypes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateOfBirth {


    private Date date;
    private Calendar calendar = Calendar.getInstance();

    public DateOfBirth(int year, int month, int day) {
        calendar.setLenient(false);
        calendar.set(year,month-1,day);
        date= calendar.getTime();
    }

    public DateOfBirth(String date,String pattern) {
        if(date==""){
            throw new IllegalArgumentException("Illegal date string, cannot parse: ");
        }
        if(pattern==""){
            throw new IllegalArgumentException("Illegal pattern string, cannot use: ");
        }


    }

    public DateOfBirth(String string, String pattern, Locale locale) {
        if(string==null||pattern==null||locale == null){
            throw new NullPointerException("Locale must not be null!");
        }
        if(string==""||pattern==""){
            throw new IllegalArgumentException("Illegal date string, cannot parse: ");
        }
        if(locale.toString()==""){
            throw new IllegalArgumentException("Illegal pattern string, cannot use: ");
        }
    }

    public boolean isWeekDay() {
        return calendar.get(Calendar.DAY_OF_WEEK) != calendar.get(Calendar.SATURDAY) && calendar.get(Calendar.DAY_OF_WEEK) != calendar.get(Calendar.SUNDAY);
    }

    public String findDayOfWeekForBirthDate(Locale locale) {
        if(locale==null){
            throw new NullPointerException("Locale must not be null!");
        }

        calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);

    }


    public String toString(String pattern) {
        if (pattern==null || pattern=="") {
            throw new IllegalArgumentException("Illegal pattern string, cannot use: " + pattern);
        }
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }
}
