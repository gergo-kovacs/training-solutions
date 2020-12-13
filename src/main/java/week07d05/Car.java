package week07d05;

public class Car extends Vehicle{

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.numberOfGears);
        System.out.println(car.transmissionType);

        Car car2 = new Car(TransmissionType.MANUAL,6);
        System.out.println(car2.numberOfGears);
        System.out.println(car2.transmissionType);
        System.out.println(car2.getNumberOfGears());
    }

    public Car() {
        super(TransmissionType.AUTOMATIC);
    }

    public Car(TransmissionType transmissionType, int numberOfGears) {
        super(transmissionType, numberOfGears);
    }

    public Car(TransmissionType transmissionType) {
        super(transmissionType);
    }


}
