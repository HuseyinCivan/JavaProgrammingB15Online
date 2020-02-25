package day27;

import day03.EscapeCharacter;

public class ArraysTask02 {
    public static void main(String[] args) {
        // Task02 :
        // write a program that can fond the min number from an int array without using sort method
        //task 02.01
        //find a program that find the secon min number
        //task 02.02

        int[] scores={100,-99,-1000,2000,5000,0,1,2000};
        int min=9999999;
        for(int i=0;i<= scores.length-1;i++){
            if(min>scores[i]){
                min=scores[i];
            }
        }
        System.out.println("min = " + min);

        int secondMinNumber=999;
        for(int i=0;i<= scores.length-1;i++){
            if (scores[i]==min){
                continue;
            }
            else if(  secondMinNumber>scores[i] ){
                secondMinNumber=scores[i];
            }
        }
        System.out.println("secondMinNumber = " + secondMinNumber);

// find the third min

        int thirdMinNUmber=999;
        for(int i=0;i<= scores.length-1;i++){
            if (scores[i]==min || scores[i]==secondMinNumber    ){
                continue;
            }
            else if(  thirdMinNUmber>scores[i] ){
                thirdMinNUmber=scores[i];
            }
        }
        System.out.println("thirdMinNUmber = " + thirdMinNUmber);





    }
}
