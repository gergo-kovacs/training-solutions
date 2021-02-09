package virtualmethod.vehicle;

public class Van extends Car{

    public static void main(String[] args) {
        Van v = new Van(100,2,10);
        System.out.println(v.toString());
    }

    private int cargoWeight;


    public Van(int numberPassenger, int vehicleWeight, int cargoWeight) {
        super(vehicleWeight, numberPassenger);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad()+cargoWeight;
    }

    @Override
    public String toString() {

        return "Van{cargoWeight=" + getCargoWeight() +", numberOfPassenger=" + getNumberPassenger()+", vehicleWeight=" +getVehicleWeight()+"}";
    }
}
