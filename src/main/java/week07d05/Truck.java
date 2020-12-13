package week07d05;

public class Truck extends Vehicle{
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck.numberOfGears);
        System.out.println(truck.transmissionType);

        Truck truck2 = new Truck(TransmissionType.AUTOMATIC,6);
        System.out.println(truck2.numberOfGears);
        System.out.println(truck2.transmissionType);

    }

    public Truck() {
        super();
    }

    public Truck(TransmissionType transmissionType, int numberOfGears) {
        super(transmissionType, numberOfGears);
    }

    public Truck(TransmissionType transmissionType) {
        super(transmissionType);
    }
}
