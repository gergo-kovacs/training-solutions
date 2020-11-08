package statements;

public class Time {

    private int hours;
    private int minute;
    private int seconds;

    public Time(int hours, int minute, int seconds) {
        this.hours = hours;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return hours*60+minute;
    }

    public int getInSeconds() {
        return hours*3600+minute*60+seconds;
    }

    public boolean earlierThan(Time time){
        return time.seconds > getInSeconds();
    }

    @Override
    public String toString() {
        return hours+":"+minute+":"+seconds;
    }

}
