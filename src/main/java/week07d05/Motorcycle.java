package week07d05;

public class Motorcycle extends Vehicle{

    public Motorcycle(TransmissionType transmissionType) {
        super(transmissionType);
    }

    public Motorcycle() {
        super(TransmissionType.SEQUENTIAL);
    }

    public Motorcycle(TransmissionType transmissionType, int numberOfGears) {
        super(transmissionType,numberOfGears);
    }
}
