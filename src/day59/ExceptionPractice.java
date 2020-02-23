package day59;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args)  {


        //this simple program will get certain character from Furkan's name
        //according to the index user provided
        System.out.println("The Start");
        String name="Furkan";

        Scanner scan=new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ");

        //we want to take different action
        //according to different type of exceptiopn happen during the program
        try{
            int targetIndex = scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            //
            //below will narrow down the catch block to
            //only catch StringOutOfBoundException and take action accordingly
            //we can have more than 1 catch block ,
            //to handle different types of exception
            //and take action according to the exception type at runtime


        }catch (StringIndexOutOfBoundsException e){
            //getMessage is a method coming from Exception class and provide some moer details about exception object


          //  System.out.println("Message from getMessage method = " + e.getMessage());
            System.out.println("You are out of bound  !!!");
            System.out.println("enter between 0 and  "+(name.length()-1));

        }catch (InputMismatchException e){
            System.out.println("Input mismatch , enter number !!!");
            System.out.println("here is what you get if you enter 0 = "+ name.charAt(0));
        }

            System.out.println("The End");

       // System.out.println("name = " + name);






        //Exceptions are objects , so it has it's own class
        //and we can create object ourselves just like we did from any other class

//        StringIndexOutOfBoundsException e1=new StringIndexOutOfBoundsException();
//        System.out.println("e1.toString() = " + e1.toString());



    }



}
