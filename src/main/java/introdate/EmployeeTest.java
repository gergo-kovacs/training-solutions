package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Tom", LocalDate.of(2000,10,2), LocalDateTime.of(2020,7,20,2,1,10));

        System.out.println("Alkalmazott neve:  "+worker1.getName());
        System.out.println("Született: "+worker1.getDateOfBirth());
        System.out.println("Felvételt nyert: "+worker1.getBeginEmployment().getYear()+" "+worker1.getBeginEmployment().getMonth()
                +" "+worker1.getBeginEmployment().getDayOfMonth()+" Time: "+worker1.getBeginEmployment().getHour()
                +":"+worker1.getBeginEmployment().getMinute()+":"+worker1.getBeginEmployment().getSecond());

    }
}
