package interfacestaticmethods.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AuditedTest {


    @Test
    public void testFind(){
        List<Audited> values = new ArrayList<>();
        Employee employee1 = new Employee("John Doe", LocalDateTime.of(2019,1,1,10,10));
        Employee employee2 = new Employee("Jane Doe", LocalDateTime.of(2021,2,1,10,10));

        values.add(employee1);
        values.add(employee2);
        Audited audited = Audited.findLastCreated(values);
        Assertions.assertEquals("Jane Doe", ((Employee) audited).getName());
    }
}
