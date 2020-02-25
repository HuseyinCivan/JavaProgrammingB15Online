package day06;

import java.util.Scanner;

public class nextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        System.out.println("What is your name ? ");
        String name=scan.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("What is your age? ");

        int age=scan.nextInt();
        //String age=scan.nextLine();
        //\notice we are not storing this into variable
        //we just want below line to capture Enter keyboard input
        //so that it does not accidentally get capture by
        //the nextline we use to capture address
        scan.nextLine();
        System.out.println("Your age is "+age);

        System.out.println("What is your address? ");
        String adresss=scan.nextLine();
        System.out.println("your adress is "+adresss);

    }
}
