package week07d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void carTestmethods(){
        Assertions.assertEquals(5, new Car().getNumberOfGears());
        Assertions.assertEquals(TransmissionType.AUTOMATIC,new Car().getTransmissionType());
    }

    @Test
    public void TruckTestmethods(){
        Assertions.assertEquals(3, new Car(TransmissionType.MANUAL,3).getNumberOfGears());
        Assertions.assertEquals(TransmissionType.AUTOMATIC,new Car().getTransmissionType());
    }
}
