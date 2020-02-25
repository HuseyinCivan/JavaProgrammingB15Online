package practice12_05_19.practice12_04_19Library;

import java.util.Scanner;

public class GiveMe5Or20$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me $5 or $20");

        int x = scan.nextInt();

while (   !  (x==5 || x==20)          ) {  // (x!=5 && x!=20)
    System.out.println("not the bill i am looking for");
    System.out.println("Give me $5 or $20");
    x=scan.nextInt();
}
    System.out.println("Bingo, got the money ");










    }
}
