package enumabstract.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransactionStateTest {

    @Test
    public void testIsCompleted(){
        Assertions.assertEquals(true,TransactionState.REJECTED.isCompleted());
        Assertions.assertEquals(false,TransactionState.PENDING.isCompleted());
    }

    @Test
    public void testisCompletedIfInterface(){
        HasTransactionState hasTransactionState = TransactionState.SUCCESS;
        Assertions.assertEquals(true,hasTransactionState.isCompleted());
    }
}
