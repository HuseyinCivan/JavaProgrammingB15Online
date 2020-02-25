package day05;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {


        // create an interactive program to ask user for day
        // and generate minute that day have


        //create an interactive program to ask user for hourly wage
        //and generate yearly salary
        // assume that he works 2080 hour for a year.





        Scanner scan = new Scanner(System.in);



        System.out.println("type day to convert it into minute");

        double day= scan.nextDouble();
        double minute= (24*60)*day;

        System.out.println(day+" day is "+minute+" minutes");

        






    }
}
