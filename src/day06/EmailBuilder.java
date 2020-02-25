package day06;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

        String firstName,lastName,company;
        //firstName ="Huseyin";
       // lastName="Civan";
       // company="ABCD";



        System.out.println("What is your first name? ");
        firstName=scan.next();
        System.out.println("What is your last name? ");
        lastName=scan.next();
        System.out.println("What is your company name? ");
        company=scan.next();

        String email=firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is "+firstName+" "+lastName+" and i work for "+company+" and my email is "+email);

        System.out.println("Enter your first name, last name ,company name seperated by space ;");
        firstName=scan.next();
        lastName=scan.next();
        company=scan.next();

        System.out.println("My name is "+firstName+" "+lastName+" and i work for "+company+" and my email is "+email);



    }
}
