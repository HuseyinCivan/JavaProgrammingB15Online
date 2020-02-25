package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_170_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

int[] lastDay={0, 0, 0, 0, 0, 0, 0, 0};
int[] temp=new int[8];
        System.out.println("Day 0 "+Arrays.toString(inhabitants));
        for (int x = 1; !Arrays.equals(inhabitants,lastDay) ; x++) {

            for (int z = 0; z < inhabitants.length ; z++) {
               temp[z]=inhabitants[z];
            }

//            for (int i = 0; i <= 7; i++) {
//                if (temp[i] == 0) {
//                    if (i >= 1)
//                        inhabitants[i - 1] = temp[i - 1] / 2;
//                    if (i <= 6)
//                        inhabitants[i + 1] = temp[i + 1] / 2;
//                }
//            }
            for (int i = 0; i <8 ; i++) {
                if (i == 0 && temp[0] == 0) {
                    inhabitants[1] = temp[1] / 2;
                } else if (i == 7 && temp[7] == 0) {
                    inhabitants[6] = temp[6] / 2;
                } else if (temp[i] == 0) {
                    inhabitants[i - 1] = temp[i - 1] / 2;
                    inhabitants[i + 1] = temp[i + 1] / 2;
                }
            }
            System.out.println("Day " + x + " " + Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");
    }
}
//int[] extinct = {0, 0, 0, 0, 0, 0, 0, 0};
//int[] temp = new int[8];
//
//int day = 0;
//do {
//    for (int i = 0; i < inhabitants.length; i++) {
//        temp[i] = inhabitants[i];
//    }
//    System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
//    for (int i = 0; i <= 7; i++) {
//        if (temp[i] == 0) {
//            if (i >= 1)
//                inhabitants[i - 1] = temp[i - 1] / 2;
//            if (i <= 6)
//                inhabitants[i + 1] = temp[i + 1] / 2;
//        }
//    }
//    day++;
//} while (!Arrays.equals(extinct, inhabitants));
//System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
//System.out.println("---- EXTINCT ----");

//3 6 0 4 3 2 7 0
//10 0 20 4 0 1 6 0

//        Day 0 [10, 0, 20, 4, 0, 1, 6, 0]
//        Day 1 [5, 0, 10, 2, 0, 0, 3, 0]
//        Day 2 [2, 0, 5, 1, 0, 0, 1, 0]
//        Day 3 [1, 0, 2, 0, 0, 0, 0, 0]
//        Day 4 [0, 0, 1, 0, 0, 0, 0, 0]
//        Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
//        ---- EXTINCT ----
//        Day 0 [10, 0, 20, 4, 0, 1, 6, 0]
//        Day 1 [5, 0, 10, 2, 0, 0, 3, 0]
//        Day 2 [2, 0, 5, 1, 0, 0, 0, 0]
//        Day 3 [1, 0, 2, 0, 0, 0, 0, 0]
//        Day 4 [0, 0, 0, 0, 0, 0, 0, 0]
//        ---- EXTINCT ----