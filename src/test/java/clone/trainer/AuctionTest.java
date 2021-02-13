package clone.trainer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuctionTest {

    @Test
    public void testClone(){
        Auction original = new Auction(10,new User("Tom"),new Product("Computer"));
        Auction auction1 = new Auction(original);
        Assertions.assertEquals(10,auction1.getPrice());
        original.setPrice(20);
        Assertions.assertEquals(10,auction1.getPrice());
        original.getUser().setName("Jane");
        Assertions.assertEquals("Jane",auction1.getUser().getName());
        Assertions.assertEquals("Computer",original.getProduct().getName());
        Assertions.assertEquals("Computer",auction1.getProduct().getName());
        original.getProduct().setName("Mobile");
        Assertions.assertEquals("Computer",auction1.getProduct().getName());

    }

}