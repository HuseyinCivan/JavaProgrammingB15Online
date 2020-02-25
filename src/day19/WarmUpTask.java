package day19;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        //assuming start speed is always less than end speed
        //create a for loop to situmilate slow increase of the speed.

        //for example if start 10 end 27

        // print ----> 10 , 11 , 12 ....27

       // if start 2 , end 5 -> print 2,3,4,5

Scanner scan=new Scanner("System.in");

int start=scan.nextInt();
int end = scan.nextInt();

        System.out.println("you have started at speed--->");

        for(int i=start ; i<=end  ;  i++){


            System.out.print(i+", ");

        }



    }
}