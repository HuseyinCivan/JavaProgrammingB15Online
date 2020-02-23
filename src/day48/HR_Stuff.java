package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {
    public static void main(String[] args) {

        //Employee is abstract super type
        //HourlyEmployee and FulltimeEmployee is specific type

        //if we have Employee for e1 variable
        //we can write down thw DDRESS OF ANYTHING IS-A Employee

        Employee e1 = new HourlyEmployee("Huseyin", 123456, 60, 2080);
       // e1.calculateAnnualSalary();

        e1 = new FullTimeEmployee("Seda", 654321, 10000);
        //e1.calculateAnnualSalary();

        Employee e2 = new HourlyEmployee("ruksana", 4564, 57, 2080);
        Employee e3 = new FullTimeEmployee("dennis", 4651, 13000);

        //what is the easiest way to store these 3 objects together

       //creating a loist with 3 Employee object
        List<Employee> allEmployee= Arrays.asList(e1,e2,e3);

        for( Employee eachEmployee   :allEmployee){
           // System.out.println("eachEmployee = " + eachEmployee);
            System.out.println(eachEmployee.name);
            eachEmployee.calculateAnnualSalary();
            System.out.println("________");
        }








    }
}
