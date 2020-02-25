package day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CompoundOperator3Reaminder {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        int bankBalance=1140;

        System.out.println("I have spent the half of it:");
        bankBalance=bankBalance/2;

        System.out.println("Now my balance is "+bankBalance);

        // i want to divide the balance by 500 and keeps the remainder in my pocket

        //bankBalance=bankBalance%500;
        bankBalance%=500; //same as above. just shorthand
        System.out.println("Divided by 500 and the remainder is "+bankBalance);










    }
}
