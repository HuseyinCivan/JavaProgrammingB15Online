package practice12_05_19.practice12_04_19Library;

import java.util.Scanner;

public class SmartLockDoWhileVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password;

        do{
            System.out.println("what is the password ?");
            password=scan.next();

        }while(! password.equals("B15"));
        System.out.println("door is open");


        // son kalan denemen su kadar eklemeye calistim , do da her zaman ilki do calistigi icin hatali oldu yapamadi !!!

//        String password;
//        System.out.println("what is the password");
//        password = scan.next();
//        int remain = 2;
//        do {
//            System.out.println("wrong password, try again ");
//            System.out.println("last " + remain + " remain");
//            remain--;
//            password = scan.next();

//            while (!password.equals("B15") && remain > 0) ;
//            if (remain == 0) {
//                System.out.println("your password is blocked");
//            }

//            if (password.equals("B15")) {
//                System.out.println("wolaaa");
//            }

        }
    }

