package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {

        int[] myNumbers = new int[]{5, 3, 21,2, 1,13,8};

        int size=myNumbers.length;
        int lastIndex=size-1;

//just to see what is inside, we are not doing anything with String
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));


        // first and last
        System.out.println(  myNumbers[1]+" "+myNumbers[lastIndex-1]         );
        System.out.println(  myNumbers[0]+"--- "+myNumbers[lastIndex] );
        //second and one before last
        System.out.println(  myNumbers[1]+"--- "+myNumbers[lastIndex-1] );
        //third ane two before last
        System.out.println(  myNumbers[2]+"--- "+myNumbers[lastIndex-2] );

        //loop this
        int middleIndex=size/2;
        for(int x=0; x<middleIndex ;x++ ){
            int temp=myNumbers[x];
            myNumbers[x]=myNumbers[lastIndex-x];
            myNumbers[lastIndex-x]=temp;

            System.out.println(  myNumbers[x]+" "+myNumbers[lastIndex-x]);

        }
        System.out.println("myNumbers after reverse = " + Arrays.toString(myNumbers));















    }
}
