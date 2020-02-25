package repl;

import java.util.Arrays;

public class Repl_130 {
    public static void main(String[] args) {

     //               0  1  2  3
        int[] number={6, 2, 5, 3};
     // shifted       2, 5, 3, 6

        //after shifting , number[] will be like below
       // int x=0;

        //number[0]=number[1];  // number[x]=number[x+1]
        //number[1]=number[2];  // number[x+1]=number[x+1+1]
        //number[2]=number[3];  // number[x+1+1]=number[x+1+1+1]  5--->3
        //number[3]=number[0];


int temp=number[0];
        for(int x=0;x< number.length-1;x++){
            number[x]=number[x+1];
        }
        //number[3]= number[number.length-1]
        number[number.length-1]=temp;

        System.out.println(Arrays.toString(number));








    }
}
