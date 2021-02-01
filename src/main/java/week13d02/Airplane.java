package week13d02;

public class Airplane {

    private String flightNumber;
    private String status;
    private String city;
    private String time;

    public Airplane(String flightNumber, String status, String city, String time) {
        this.flightNumber = flightNumber;
        this.status = status;
        this.city = city;
        this.time = time;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getCity() {
        return city;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "flightNumber='" + flightNumber + '\'' +
                ", status='" + status + '\'' +
                ", city='" + city + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
