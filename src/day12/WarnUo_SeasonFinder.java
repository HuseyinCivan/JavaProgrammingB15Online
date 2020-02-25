package day12;

import java.util.Scanner;

public class WarnUo_SeasonFinder {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

       int month;
       month=scan.nextInt();


        if (month == 12 || month == 1 || month == 2) {
            System.out.println("it is Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("it is spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("it is summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("it is fall");
        } else if(month < 1 || month > 12){
            System.out.println("INVALID MONTH");
    }








    }

}