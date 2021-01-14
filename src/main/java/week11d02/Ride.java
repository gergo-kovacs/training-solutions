package week11d02;

public class Ride {
    private int day;
    private int number;
    private double length;

    public Ride(int day, int number, double length) {
        this.day = day;
        this.number = number;
        this.length = length;
    }


    public int getDay() {

        return day;
    }

    public int getNumber() {

        return number;
    }

    public double getLength() {

        return length;
    }
}