package activity;

public class Coordinate {

    private final double latitude;
    private final double longitude;


    public Coordinate(double latitude, double longitude){
        if(!correctLatitude(latitude) || !correctLongitude(longitude)){
            throw new IllegalArgumentException();
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    private boolean correctLatitude(double latitude){
        return latitude>-90.0 && latitude<90;
    }

    private boolean correctLongitude(double longitude){
        return longitude>-180.0 && longitude<180;
    }

}
