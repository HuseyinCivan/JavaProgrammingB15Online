package practice12_11_19;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArray {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("what is your full name? ");
        String name= scan.nextLine();

        char[] yourNameChar=name.toCharArray();

        System.out.println(Arrays.toString(yourNameChar));

        int counter=0;

        for ( char eachChar   :  yourNameChar   ){


            System.out.println(eachChar);

            if(eachChar=='a'){
                counter++;
            }
        }

        System.out.println("counter = " + counter);







    }
}
