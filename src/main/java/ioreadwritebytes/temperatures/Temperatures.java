package ioreadwritebytes.temperatures;

public class Temperatures {
    private byte[] data = new byte[365];

    public Temperatures(byte[] days) {
        this.data = days;
    }

    public byte[] getData() {
        return data;
    }

    public double getMonthAverage(){
        double sum = 0.0;
        for (int i = data.length-1; i >= data.length-30 ; i--) {
            sum+= data[i];
        }
        return sum/30;
    }

    public double getYearAverage(){
        double sum = 0.0;
        for (int i = 0; i<365 ; i++) {
            sum+= data[i];
        }
        return sum/365;
    }
}
