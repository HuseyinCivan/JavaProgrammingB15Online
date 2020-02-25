package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

//        * voting Eligibility program
//        *
//        * create a variable called age as int
//        *
//        * check weATHER this age is more than 18
//        * if yes print : you are ready to vote!!!
//        * if it is less 18 print wait until you are 18
//        *


        // create a program to guess your favorite number
        //create a variable called myFavoriteNumber as int
        //ask user to guess your favorite number
        //if user guess right then print BINGO!!
        // if not print try again later

        int age = 27;

        if (age >= 18) {
            System.out.println("you are ready to vote!!");
        } else {
            System.out.println("wait until you are 18!!");
        }



        int myFavoriteNumber = 7;
        System.out.println("guess my favorite number ");
        int guessNumber;
        guessNumber=scan.nextInt();


        if (guessNumber == myFavoriteNumber) {
            System.out.println("BINGO!!!");
        }else{
            System.out.println("try again later");
        }















    }

}
