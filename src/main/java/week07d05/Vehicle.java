package week07d05;

/*
* Készíts a week07d05 csomagba egy Vehicle, egy Car, egy Truck és egy Motorcycle osztályt.
* A Vehicle osztálynak legyen egy int getNumberOfGears és egy TransmissionType getTransmissionType metódusa.
* A fenti osztályok értelemszerűen öröklődjenek egymásból és mindegyiknek implementálja a sebességek számát
*  és a váltó típusát. A lehetséges váltótípusok: MANUAL, AUTOMATIC, SEQUENTIAL. Az alapértelmezett váltó típus
* (a Vehicle osztályban) MANUAL, de a Car automatikus, míg a Motorcycle SEQUENTIAL. Az alapértelmezett sebesség szám 5.
*
* */

public class Vehicle {


    final TransmissionType transmissionType;
    final int numberOfGears;

    public Vehicle(){
        this.transmissionType = TransmissionType.MANUAL;
        this.numberOfGears = 5;
    }

    public Vehicle(TransmissionType transmissionType, int numberOfGears) {
        this.transmissionType = transmissionType;
        this.numberOfGears = numberOfGears;
    }

    public Vehicle(TransmissionType transmissionType) {
        this.transmissionType=transmissionType;
        this.numberOfGears = 5;
    }


    public int getNumberOfGears(){
        return numberOfGears;
    }

    public TransmissionType getTransmissionType(){
        return transmissionType;
    }




}
