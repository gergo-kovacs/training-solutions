package methoverloading.pub;


import methoverloading.Time;

public class Pub {
    private String name;
    private int hours;
    private int minutes;
    private Time time;

    public Pub(String name, int hours, int minutes) {
        time = new Time(hours,minutes);
        this.name = name;
        this.hours = hours;
        this.minutes = minutes;

    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public Time getOpenFrom(){
        return time;
    }

    @Override
    public String toString() {
        return name + ";" + hours + ":" + minutes;
    }
}
