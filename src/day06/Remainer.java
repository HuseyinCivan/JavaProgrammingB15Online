package day06;

import java.util.Scanner;

public class Remainer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(5/2);

        System.out.println(5.0/2);

        System.out.println(5.0/2f);

        // 5 divided by 2 and remainder is 1
        System.out.println("----modules . remainder ----");
        System.out.println(5 % 2);
        System.out.println(99 % 10);

        System.out.println(100%10);

        //declare a variable called minutes data type int
        //ask user enter minutes as whole number
        //print the result in x hour y minutes format
        //for ex 135 minutes . 2 hours 15 minutes

        System.out.println("enter minute");
        int askMinute=scan.nextInt();
        int hour=(askMinute/60);
        int minute=(askMinute%60);

        System.out.println(askMinute+" is "+hour+" hours and "+minute+" minutes");



    }
}
