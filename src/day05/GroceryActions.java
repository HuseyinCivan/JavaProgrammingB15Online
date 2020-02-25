package day05;

//import java.util.Scanner;

import javax.tools.SimpleJavaFileObject;
//import java.util.Scanner;
//import java.util.Scanner;
//
//import java.util.Scanner;
//
//import java.util.Scanner;
//
import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;



    /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */


    public class GroceryActions {

    public static void main(String[] args) {

        //Scanner scan=new Scanner(System.in);

        //Scanner scan=new Scanner(System.in);
//        Scanner scan = new Scanner (System.in);
//        Scanner scan=new Scanner(System.in);
//        Scanner scan=new Scanner(System.in);
       // Scanner scan=new Scanner(System.in);

//        Scanner Scan=new Scanner(System.in);
//
//        Scanner scan=new Scanner(System.in);

//import java.util.Scanner;
//Scanner scan= new Scanner(System.in);

           /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */
           Scanner scan=new Scanner(System.in);
           System.out.println("What is the price of tomato?");
           float priceOfTomato=scan.nextFloat();
           System.out.println("How many tomatos do you want to buy?");
           int numberOfTomato=scan.nextInt();
           System.out.println("What is the price of potato?");
           float priceOfPotato=scan.nextFloat();
           System.out.println("How many Potato do you want to buy?");
           int numberOfPotato=scan.nextInt();
           System.out.println("What is the price of banana? ");
           float priceOfBanana=scan.nextFloat();
           System.out.println("How many banana do you want to buy?");
           int numberOfBanana=scan.nextInt();


           System.out.println("You got "+numberOfTomato+" tomato and the total is "+(numberOfTomato*priceOfTomato)+"$");
           System.out.println("You got "+numberOfPotato+ " potato and the total is "+(numberOfPotato*priceOfPotato)+"$");
           System.out.println("You got "+numberOfBanana+" banana and the total is "+(numberOfBanana*priceOfBanana)+"$");

           System.out.println("Your grand total for this shopping is "+((numberOfBanana*priceOfBanana)+(numberOfTomato*priceOfTomato)+(numberOfPotato*priceOfPotato))+"$");




































        //        //Scanner scan = new Scanner(System.in);
//
//        System.out.println("what is the price for potato");
//        float potatoPrice = scan.nextFloat();
//        System.out.println("How many you want to buy ?");
//        int potatoCount = scan.nextInt();
//        float potatoTotal = potatoPrice * potatoCount;
//        System.out.println("Your total for potato is " + potatoTotal);
//
//        System.out.println("what is the price for tomato");
//        float tomatoPrice = scan.nextFloat();
//        System.out.println("How many you want to buy ?");
//        int tomatoCount = scan.nextInt();
//        float tomatoTotal = tomatoPrice * tomatoCount;
//        System.out.println("Your total for tomato is " + tomatoTotal);
//
//        System.out.println("what is the price for banana");
//        float bananaPrice = scan.nextFloat();
//        System.out.println("How many you want to buy ?");
//        int bananaCount = scan.nextInt();
//        float bananaTotal = bananaPrice * bananaCount;
//        System.out.println("Your total forr potato is " + bananaTotal);
//
//        System.out.println("You got " + tomatoCount + " tomatos, the price is " + tomatoPrice
//                + " and the total is $" + tomatoTotal);
//
//        System.out.println("You got " + potatoCount + " potatoes , the price is " + potatoPrice
//                + " and the total is $" + potatoTotal);
//
//        System.out.println("You got " + bananaCount + " bananas , the price is " + bananaPrice
//                + " and the total is $" + bananaTotal);
//
//        System.out.println("Your grand total for this shopping is $" +
//                (tomatoTotal + potatoTotal + bananaTotal));


    }
}