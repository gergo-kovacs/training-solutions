package week09d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SantaClausTest {

    @Test
    public void testSantaClaus(){

        Person person = new Person("Tom",10);
        Person person2 = new Person("Lara",16);
        Person person3 = new Person("Béla",9);
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);
        persons.add(person3);
        SantaClaus santaClaus = new SantaClaus(persons);
        santaClaus.getThroughChimneys();
        santaClaus.presentList();

        Assertions.assertEquals(null,person2.getPresent());

    }
}
