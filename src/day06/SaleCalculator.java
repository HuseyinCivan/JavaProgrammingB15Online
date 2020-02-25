package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {

        //create a programm to calcu;ate teh final discountrf price of am item

        //create three double variables called regularPrice salePrice and discountPercentage

        //ask user question using scanner for regular price and discount
         //       and save the result into the variable

        // calculate sale price using above information

        //for ex 80 regular price 0.2 fof discount sale price---->64
        //print out : your regular price is 80 , discount is 0.2 and you got a deal for 64 $

        Scanner scan= new Scanner(System.in);
        double regularPrice, salePrice, discountPercentage;
        System.out.println("What is the regular price of the item?");
        regularPrice=scan.nextDouble();
        System.out.println("What is the discount for item?");
        discountPercentage=scan.nextDouble();
        salePrice= (100-discountPercentage)*regularPrice/100;
        System.out.println("Your regualar price is "+regularPrice+"$ discount is %"+discountPercentage+" and you got a deal for "+salePrice+"$");



        // if you have variables in same data types you can declare them in one like this
       // double regularPrice, salePrice, discountPercentage;














    }

}
