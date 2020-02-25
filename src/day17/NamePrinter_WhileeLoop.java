package day17;

import java.util.Scanner;

public class NamePrinter_WhileeLoop {
    public static void main(String[] args) {
        String name= "Alexander"  ;

//        int x=0;
//
//
//        while(x<name.length()) {
//            System.out.print("index "+x+":");
//            System.out.println(name.charAt(x));
//            ++x;
//        }

               int y=name.length();
        while(y>0){
            System.out.println(name.charAt(y-1));
            --y;
        }
        System.out.println("-----------------------------------");
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your name?");
        String myName=scan.nextLine();
        int z= myName.length();

        while(z>0){
            System.out.print(myName.charAt(z-1)+" ");
            --z;
        }








    }
}
