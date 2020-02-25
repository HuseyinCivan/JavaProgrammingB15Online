package day40;

import java.util.ArrayList;

public class HotMarketActions2 {

    public static void main(String[] args) {

        Offer o1=new Offer();

        o1.company="Apple";
        o1.location="Austin";
        o1.isFullTime=true;
        o1.salary=140000;

        o1.displayInformation();

        System.out.println("___________________");

        Offer o2=new Offer();

        o2.company="Google";
        o2.location="Boston";
        o2.isFullTime=true;
        o2.salary=100000;

        o2.displayInformation();

        System.out.println("___________________");

        Offer o3=new Offer();

        o3.company="Amazon";
        o3.location="Vancouver";
        o3.isFullTime=true;
        o3.salary=96000;

        o3.displayInformation();
        System.out.println("___________________");


        Offer o4=new Offer();
        // if we dont assing values for instance field | variable
        //we get default value
        //for primitive numbers : 0 or 0.0
        //             boolean : false
        //             char    :''
        //for any reference types : null
        o4.displayInformation();
        System.out.println("================================");


        //add 2k to the amazon offer

        o3.salary=o3.salary+2000;
        System.out.println("o3 = " + o3.salary);

//set the salary value of o4 ofer to sum of all the offers
        
        o4.salary=o1.salary+o2.salary+o3.salary;
        System.out.println("o4.salary = " + o4.salary);
        o4.displayInformation();
        
        o4.turnToFullTime();
        o4.turnToFullTime();
        o4.displayInformation();

        o4.changeLocation("DC");
        o4.displayInformation();



    }
}
