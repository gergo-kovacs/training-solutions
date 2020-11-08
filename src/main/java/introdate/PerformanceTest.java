package introdate;

import statements.Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance quenn = new Performance(LocalDate.of(1989,06,02),"Queen",
                                LocalTime.of(18, 00), LocalTime.of(20, 00));
        quenn.getInfo();
    }

}
