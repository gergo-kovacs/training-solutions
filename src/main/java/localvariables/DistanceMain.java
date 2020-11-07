package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance dist = new Distance(10.3,true);
        System.out.println(dist.getDistanceInKm()+" Km");

        int wholePart = (int) dist.getDistanceInKm();
        System.out.println(wholePart);
    }
}
