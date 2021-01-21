package week12d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {

    @Test
    void statistics() {
        Street street = new Street();

        street.sellSite(new Site(0,10,Fence.NEED_UPGRADE));
        street.sellSite(new Site(1,10,Fence.PERFECT));
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.statistics();
        Assertions.assertEquals(2,Fence.PERFECT.getN());
        Assertions.assertEquals(1,Fence.NEED_UPGRADE.getN());
    }
}