package repl;

import java.util.Arrays;
import java.util.Scanner;
//x=0
//Day 0 [3, 6, 0, 4, 3, 2, 7, 1] --->day x
//Day 1 [1, 3, 0, 2, 1, 1, 3, 0]----->day x+1
//Day 2 [0, 1, 0, 1, 0, 0, 1, 0]----->day x+1+1
//Day 3 [0, 0, 0, 0, 0, 0, 0, 0]----->day x+1+1+1
// NESTED LOOP IS COMING !
//---- EXTINCT ----
public class Repl_127_ment {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for(int i=0; i<inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }
    //in this question this array represents the population of 8 cities,
    //every other day the population will be divided by 2
    // at the end of the n number of days , all the population will be 0.

    // lets use this example to solve
    //                   0  1  2  3  4  5  6  7
    int[] inhabitants = {3, 6, 0, 4, 3, 2, 17, 1};

    //for loop through we need to know when this loop will be finalized
    // there is a few options for that


    //i ll use one of them. i ll use one
    // in my approach
    //when the max populated city reaches 0,
    // first need to find index of most populated city
    // how am i gonna do this ?
    //create an int value to store index num

    int indexOfMaxValue = 0;
    for( int x = 0; x<inhabitants.length;x++){

        //what is condition ?
        if (inhabitants[indexOfMaxValue] < inhabitants[x]) {
            indexOfMaxValue = x;

        }
    }

        // let see what is the index of max value
        System.out.println("indexOfMaxValue = " + indexOfMaxValue);


        // now we can loop through in this array
 ////Day 0 [3, 6, 0, 4, 3, 2, 7, 1] --->day x
        System.out.println("Day "+"0"+ Arrays.toString(inhabitants));
        for (int x = 1; inhabitants[indexOfMaxValue]!=0 ; x++){    // just we know inhabitants[indexOfMaxValue]==0
            for (int y = 0; y <inhabitants.length ; y++) {
              inhabitants[y]= inhabitants[y]/2;

            }
            System.out.println("Day "+x+ Arrays.toString(inhabitants));

    }
        System.out.println("---- EXTINCT ----");
}
//done

}







