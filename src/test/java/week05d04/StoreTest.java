package week05d04;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import stringconcat.employee.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StoreTest {

    @Test
    public void ProductIsNotBeEmpty(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Store().addProduct(null));
        assertEquals("product can't be empty", ex.getMessage());
    }






}
