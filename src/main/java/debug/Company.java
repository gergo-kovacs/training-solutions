package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> employees = new ArrayList<>();

    public Company(List<Employee> empl){
        employees = empl;
    }

    public void addEmployee(Employee empl){
        employees.add(empl);
    }

    public Employee findEmployeeByName(String name){

        for (Employee item:employees) {
            if(item.getName().equals(name))
                return item;
        }
        return null;

        /*
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getName().equals(name))
                return employees.get(i);
        }
        return null;
        */
    }


    public List<String> listEmployeeNames(){
        List<String> listName = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            listName.add(employees.get(i).getName());
        }
        return listName;
    }


}
