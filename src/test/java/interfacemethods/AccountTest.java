package interfacemethods;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AccountTest {

    @Test
    public void testCreatedAfter(){
        Account account = new Account(LocalDateTime.of(2018,1,1,10,0));
        boolean result = account.createdAfter(LocalDateTime.of(2018,1,1,11,0));
        Assertions.assertEquals(result,equals(false));
    }

}
