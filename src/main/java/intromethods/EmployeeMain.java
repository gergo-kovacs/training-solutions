package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom",2000,2000);
        Employee employee2 = new Employee("Vilmos",3200,2010);
        Employee employee3 = new Employee("Anna",44000,2020);

        employee1.raiseSalary(10001);

        System.out.println(employee1+" "+employee2+" "+employee3);
        System.out.println(employee1.toString());
        System.out.println(employee1.getName());
    }
}
