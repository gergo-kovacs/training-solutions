package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;

    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger){
        if(passengers.size()<boat.getMaxPassengers()){
            passengers.add(passenger);
        }else{
            throw new IllegalArgumentException();
        }
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {

        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }


    public double getPriceForPassenger(Passenger john_doe) {

        return john_doe.getCruiseClass().getMultiplier()*getBasicPrice();
    }

    public Passenger findPassengerByName(String jack_doe) {

        for (Passenger passenger : passengers) {
            if(passenger.getName().equals(jack_doe)){
        return passenger;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered() {

        Collections.sort(passengers);
        return null;

    }

    public double sumAllBookingsCharged() {
        for (Passenger passenger : passengers) {
            passenger.getCruiseClass().getMultiplier();
        }
        return 0;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        return null;
    }
}
