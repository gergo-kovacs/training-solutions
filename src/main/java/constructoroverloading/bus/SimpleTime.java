package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes){
    this.hours = hours;
    this.minutes = minutes;
    }

    public SimpleTime(int hours){
        this.hours=hours;
        this.minutes=0;
    }

    public SimpleTime(SimpleTime time){
        this.hours = time.hours;
        this.minutes = time.minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int difference(SimpleTime time){
        return (this.hours - time.hours)*60 + (this.minutes-time.minutes);
    }

    public String toString(){
        return getHours()+":"+getMinutes();
    }
}
