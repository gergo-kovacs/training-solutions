package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserTest {

    @Test
    public void fullNameTest(){

        assertEquals("kiss istvan",new User("kiss","istvan","istvan@email.de").getFullName());
    }

    @Test
    public void emailIsNotValidTest(){
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            new User("nagy","emil","emil.emil");
        });

        assertEquals("@ és . az email címben kötelező!",ex.getMessage());
    }
}
