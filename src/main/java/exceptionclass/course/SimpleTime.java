package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;
    private String time;

    public SimpleTime(String time){
        if(time==null){
            throw new InvalidTimeException("Time is null",time);
        }
        if((time.length()<5) || time.contains(",")){
            throw new InvalidTimeException("Time is not hh:mm",time);
        }
        this.time = time;
        hourAndMinuteChecked(time);
    }

    public SimpleTime(int hour, int minute) {
        if(hour>23 || hour <0){
            throw new InvalidTimeException("Hour is invalid (0-23)",hour,minute);
        }
        if(minute>59 || minute <0){
            throw new InvalidTimeException("Minute is invalid (0-59)",hour,minute);
        }
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private boolean isInteger(String number){
        try{
            Integer.parseInt(number);
            return false;
        }catch (NumberFormatException nfe){
            return true;
        }
    }

    private void hourAndMinuteChecked(String time){
        int min;
        int hour;
        if(isInteger(time.substring(3)) || isInteger(time.substring(0, 2))){
            throw new InvalidTimeException("Time is not hh:mm",time);
        }
        min = Integer.parseInt(time.substring(3));
        hour = Integer.parseInt(time.substring(0,2));
        if(hour>23 || hour <0){
            throw new InvalidTimeException("Hour is invalid (0-23)",hour,min);
        }
        if(min>59 || min <0){
            throw new InvalidTimeException("Minute is invalid (0-59)",hour,min);
        }
        this.minute = min;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
