package week11d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week11d03.WordFilter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourierTest {


    @Test
    public void addRideTestIfFreeWeek(){
        Assertions.assertEquals(1,new Courier().getDayOff());
    }

    @Test
    public void addRideTest(){
        Courier courier = new Courier();
        courier.addRide(new Ride(1,1,23));
        courier.addRide(new Ride(2,1,23));
        courier.addRide(new Ride(2,2,23));
        courier.addRide(new Ride(4,1,23));
        courier.addRide(new Ride(5,1,23));
        Assertions.assertEquals(3,courier.getDayOff());
    }

    @Test
    public void addRideTestBadInput(){
        Courier courier = new Courier();
        courier.addRide(new Ride(1,1,23));
        courier.addRide(new Ride(2,1,23));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> courier.addRide(new Ride(2,1,23)));
        assertEquals("Not a good input.", ex.getMessage());
    }



}
