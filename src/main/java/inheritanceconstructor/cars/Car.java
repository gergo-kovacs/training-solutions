package inheritanceconstructor.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity){
        if(fuel>tankCapacity){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
    this.fuelRate = fuelRate;
    this.fuel = fuel;
    this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return this.fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel = this.fuel - Math.abs(fuel);
    }

    public void drive(int km){
        this.fuel = this.fuel - (km * fuelRate/100);
        if(this.fuel<=0){
            throw new RuntimeException("Not enough fuel available!");
        }
    }
    public double calculateRefillAmount(){
        return tankCapacity - fuel;
    }
}
