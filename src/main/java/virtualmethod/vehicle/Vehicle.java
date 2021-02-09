package virtualmethod.vehicle;



public class Vehicle {

    protected static int PERSON_AVERAGE_WEIGHT=75;

    private int vehicleWeight;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    protected int getGrossLoad(){
        return vehicleWeight+PERSON_AVERAGE_WEIGHT;
    }



    @Override
    public String toString() {
        return "Vehicle{vehicleWeight="+getVehicleWeight()+"}";
    }

}
