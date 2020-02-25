package day06;

import java.util.Scanner;

class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);



       // System.out.println("What is your name ? ");
        //nextline medhod of scanner is used to capture whole line

        //String name=blabla.nextLine();
       // System.out.println("You have entered "+name);

        //task
        //use next line to ask your bio

        //what is your name
        //which city you live in including state
        //what is your street adress

        System.out.println("what is your name?");

        String myName=blabla.nextLine();


        System.out.println("which city you live in? ");

        String liveIn=blabla.nextLine();

        System.out.println("What is your adress");
        String adress=blabla.nextLine();

        System.out.println("your name is "+myName);
        System.out.println("your live in "+liveIn);
        System.out.println("your adress is "+adress);







    }


}