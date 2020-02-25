package day09;

import java.util.Scanner;

public class Repl35_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE

   int smartphone,laptop,charger,uSbCable,headphones,pants,hat,socks,blanket,pillow;
        smartphone=300;
        laptop=50;
        charger=15;
        uSbCable=10;
        headphones=30;
        pants=50;
        hat=25;
        socks=5;
        blanket=60;
        pillow=40;

//        Example #2
//        input: Pants
//        output: Thank you for your purchase!
//                output: Your current balance is: 50$
//
//        Example #3
//        input: Laptop
//        output: Sorry, not enough funds on your gift card!

        if(item.equals("Smart Phone")) {
            if(100-smartphone>=0) {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100 - smartphone) + "$");
            }else if(100-smartphone<0) {
                System.out.println("Sorry, not enough funds on your gift card!");

            }
        }if(item.equals("Laptop")){

        }else if(100-laptop>=0){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - laptop) + "$");
        }else if(100-laptop<0){
            System.out.println("Sorry, not enough funds on your gift card!");
        }












            }



        }
















