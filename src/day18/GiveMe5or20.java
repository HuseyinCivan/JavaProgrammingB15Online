package day18;

import java.util.Scanner;

public class GiveMe5or20 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("GIVE ME 5 OR 20!! ");
        int x=scan.nextInt();
//           !(x==5 || x==20  )
      //  while( x!=5 && x!=20  ){
        while (!(x==0 || x==20)){
            System.out.println("NOT THE BILL I AM LOOKING FOR");
            System.out.println("GIVE ME 5 OR 20");
            x=scan.nextInt();
        }
        System.out.println("HAPPY ENDING !! GOT THE MONEY ");










    }
}
