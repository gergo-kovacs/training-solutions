package week13d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HungarianCitiesTest {

    @Test
    public void CityNameTest(){
        HungarianCities cities = new HungarianCities();
        Assertions.assertEquals("5111 Jászfelsőszentgyörgy",cities.searchLongestCityName());
    }

}