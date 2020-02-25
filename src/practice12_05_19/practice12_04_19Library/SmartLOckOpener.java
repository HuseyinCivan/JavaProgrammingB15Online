package practice12_05_19.practice12_04_19Library;

import java.util.Scanner;

public class SmartLOckOpener {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("what is the password");
        String password=scan.next();
        int x =2;

       if(password.equals("B15")){
           System.out.println("Walaaa");
       }

        while( !password.equals("B15") && x>0    ){
            System.out.println("Wrong Password Try again");
            System.out.println(x+" try remain");
            x--;
            password=scan.next();
        }
        System.out.println("your password is locked");







    }
}
