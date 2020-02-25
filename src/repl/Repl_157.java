package repl;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Repl_157 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
//Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
//Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//Function Description
//It should print a new string representing the input time in 24 hour format.
//timeConversion has the following parameter(s):
//s: a string representing time in  12 hour format
//
//Input: 07:05:45PM
//Output: 19:05:45

        String[] arrTime = s.split(":");

        if (arrTime[0].equals("12") && arrTime[1].equals("00") && arrTime[2].equals("00AM") ) {
            arrTime[0]="00";
            arrTime[2]="00";


        } else if (arrTime[0].equals("12") && arrTime[1].equals("00") && arrTime[2].equals("00PM") ) {
            arrTime[0]="12";
            arrTime[2]="00";
        } else {

            if (arrTime[arrTime.length - 1].contains("PM")) {
                arrTime[0] = String.valueOf(Integer.parseInt(arrTime[0]) + 12);
                arrTime[2]=arrTime[2].replace("PM", "");


            } else if (arrTime[arrTime.length - 1].contains("AM")) {
                arrTime[2]=arrTime[2].replace("AM", "");

            }

        }
        System.out.println(arrTime[0]+":"+arrTime[1]+":"+arrTime[2]);
    }
}