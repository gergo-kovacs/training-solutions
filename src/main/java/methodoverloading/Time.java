package methodoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(Time time){
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }



    private int inSeconds(){
        return 3600 * hours + 60 * minutes + seconds;
    }

    public boolean isEqual(Time time){
        return inSeconds() == time.inSeconds();
    }

    public boolean isEqual(int hours,int minutes, int seconds){
        Time time = new Time(hours,minutes,seconds);
        return isEqual(time);
    }

    public boolean isEarlier(Time time){
        return inSeconds()<time.inSeconds();
    }

    public  boolean isEarlier(int hours,int minutes, int seconds){
        Time anotherTime = new Time(hours,minutes,seconds);
        return isEarlier(anotherTime);
    }

}
