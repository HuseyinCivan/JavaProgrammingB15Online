package day26;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {


        int[] myNumber={10,40,30,7};

        myNumber [2]=myNumber [0]+myNumber[1];

        int temp;
        temp=myNumber[0];
        myNumber[0]=myNumber[myNumber.length-1];
        myNumber[myNumber.length-1]=temp;

        System.out.println(Arrays.toString(myNumber));

















    }


}
