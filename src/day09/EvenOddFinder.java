package day09;
//DAY 9 :
//
//// Task 1
//        Create a class called EvenOddFinder with main method
//
//
//        Write a program to find out a number is even or odd
//        Create a int variable called myNumber and assign a value
//
//        If the number is even then says  this is a even number
//        If the number is odd then says  this is a odd number
//
//// Task 2
//        Create a class called CitizenTypeChecker with main method
//        Create a variable called cityzenType as String
//        And create a variable with age
//        If the age  is more than 65 , assign value of  cityzenType to Senior
//        If not , assign value of  cityzenType to Not-Senior
//
//        Both tasks optionally use Scanner

        import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int number;
        System.out.println("pick a number");
        number=scan.nextInt();

        int remainder=number%2;

        if(remainder==0){
            System.out.println("This is an Even Number");

        }else if(remainder==1){
            System.out.println("This is an Odd Number");
        }










    }
}
