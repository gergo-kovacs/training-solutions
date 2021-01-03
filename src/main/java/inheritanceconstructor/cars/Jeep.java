package inheritanceconstructor.cars;

public class Jeep extends Car{
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel,tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public double getFuelRate() {
        return super.getFuelRate();
    }

    @Override
    public double getFuel() {
        return super.getFuel();
    }

    @Override
    public double getTankCapacity() {
        return super.getTankCapacity();
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    private boolean isEnoughFuelJeep(int distance) {
        return ((super.getFuel() + extraFuel) - distance * super.getFuelRate() / 100) >= 0.0;
    }

    @Override
    public void drive(int km) {
        if (!isEnoughFuelJeep(km)) {
            throw new RuntimeException("Not enough fuel available!");
        }
        double usedFuel = km * super.getFuelRate() / 100;
        extraFuel -= usedFuel;
        if (extraFuel < 0) {
            modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }


    @Override
    public double calculateRefillAmount() {
        return (super.getTankCapacity()+extraCapacity)-(super.getFuel()+extraFuel);
    }
}
