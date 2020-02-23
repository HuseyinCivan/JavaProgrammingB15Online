package ListSetMapWorkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("seda","civan", "SALES", 140000);
        Employee emp2 = new Employee("Hus","civan", "IT", 160000);
        Employee emp3 = new Employee("ayse","ali", "IT", 80000);
        Employee emp4 = new Employee("fatm","faki", "MANAGEMENT", 98000);
        Employee emp5 = new Employee("anil","akin", "DEVOPS", 130000);

        employees.addAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5));

        for (Employee each : employees) {
            if(each.getSalary()>100000){
                System.out.println("each = " + each);
            }
        }




    }
}
