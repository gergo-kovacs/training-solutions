package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testCreate(){
        Employee employee = new Employee("John",20);

        String resultName = employee.getName();

        assertEquals("John",resultName);
    }

    @Test
    public void testHaveBirthDay(){
        Employee employee = new Employee("Jack",23);

        employee.haveBirthDay();

        assertEquals(24,employee.getAge());
    }
}
