package day05;
import java.util.Scanner;
public class YearlySallary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //    Task 4 :
//    *  Create an interactive program to ask user for hourly wage
//    *  and generate yearly salary
//        assume that he works 2080 hour for a year.

     System.out.println("what is your hourly wage?");
     float hourlyWage=scan.nextFloat();
     Float yearlyWage=hourlyWage*2080;

     System.out.println("Your yearly wage is $"+yearlyWage);






    }
}
