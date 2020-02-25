package day06;

import java.util.Scanner;

public class CoinConverter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        //you have 200 cent
        //how many quarter you can get 25c
        // how many dime you can get 10c
        // how many nickel you can get 5c
        //how many penny you can get 1c

        //you have purchased candle for 0.74 cent
        //what would be your remainder

        int cent=200;
        cent-=74;  // 126 cent  after spending 74 cent for candle
        System.out.println(cent);

        int quarter= cent/25;
        int penny=126%25;
        System.out.println("how many quarter do we get "+quarter+ " and the remainder cent is "+penny);

       //now i want to try to calculate dime for same money i got after purchase

        int dime= cent/10;
        penny=cent%10;

        System.out.println("how many dime do we get "+dime+" and the remainder cent is "+penny);
















    }
}
