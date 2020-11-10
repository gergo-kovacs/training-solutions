package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Employee empl1 = new Employee("worker1",1987);
        Employee empl2 = new Employee("worker2",1977);
        Employee empl3 = new Employee("worker3",1967);

        List<Employee> workers = new ArrayList<>();
        Company company = new Company(workers);

        company.addEmployee(empl1);
        System.out.println(company.listEmployeeNames());
        company.addEmployee(empl2);
        company.addEmployee(empl3);
        System.out.println(company.listEmployeeNames());
        System.out.println(company.findEmployeeByName("worker2").getYearOfBirth());


    }
}
