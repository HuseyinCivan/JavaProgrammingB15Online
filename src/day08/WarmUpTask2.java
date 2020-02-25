package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//        int myFavoriteNumber = 7;
//        System.out.println("guess my favorite number");
//        int guessNumber;
//        guessNumber=scan.nextInt();
//
//
//        if (guessNumber == myFavoriteNumber) {
//            System.out.println("BINGO!!!");
//        }else{
//            System.out.println("try again later");
//        }
        System.out.println("guess my favorite number");
        int myFavoriteNumber=scan.nextInt();

        if(myFavoriteNumber==300){
            System.out.println("BINGO!!");
        }else{
            System.out.println("YOU ARE NOT MY BEST FRIEND, TRY AGAIN");
        }








    }
}
