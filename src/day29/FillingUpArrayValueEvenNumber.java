package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {

 // fill up with even numbers including with 0;

        int[] numbers=new int[100];

        numbers[0]=0;
        numbers[1]=2;    //1 * 2
        numbers[2]=4;    //2 * 2
        numbers[3]=6;    //3 * 2
        numbers[4]=8;    //4 * 2
        numbers[6]=10;   //5 * 2
        //........
        numbers[99]=198;   //99 * 2

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i*2;

        }
        System.out.println(Arrays.toString(numbers));

        //Create an array with size 300 and fill it up with I Love Java

        String[] sentence=new String[300];

        for (int x = 0; x < sentence.length; x++) {
            sentence[x]="I love Java";
            System.out.println(sentence[x]);
        }

        System.out.println(Arrays.toString(sentence));













    }
}
