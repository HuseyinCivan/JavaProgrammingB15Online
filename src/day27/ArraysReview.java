package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {
    public static void main(String[] args) {

   /*
   Array = a variable that allows us to store multible values
   regular variables:
   we can only store one single value
   int a=100;

   array variables:

   int[] arr = { 1 , 2 ,3 }
   index         0   1  2

    */
//////
        /////

        //Task01 :  write a program that asks user to enter a number 5 times , and store those number into array

        //print the largest number
        int[] numbers=new int[5];
        Scanner scan=new Scanner(System.in);


        for (int x=0;x<=numbers.length-1;x++){
            System.out.println("Enter an int number: ");
            numbers[x]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        //Arrays.sort(variableName) : sorts the array in ascending order

        Arrays.sort(numbers);

        int largestNumber =  numbers[numbers.length-1];
        System.out.println("largestNumber = " + largestNumber);

        int minNumber=numbers[0];
        System.out.println("minNumber = " + minNumber);

















    }
}
