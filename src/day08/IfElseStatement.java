package day08;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int speedLimit=60;
        int yourCurrentSpeed=100;

        //if the current speed is more than speed limit
        //get pulled over by the police
        //given ticket by the police
        //taken away some point on your license
        //go to cort

        boolean IamSpeeding = ( yourCurrentSpeed > speedLimit );
        //inside paranthesis we can only put
        //BOOLEAN VALUE
        //BOOLEAN VARIABLE
        //ANY EXPRESSION THAT RETURN BOOLEAN VALUE

        //if not over the limit
        //go shopping

        //outside if statement, say the end

        //if (IamSpeeding){
        //if (true){
            if (yourCurrentSpeed > speedLimit) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some point on your license");
            System.out.println("go to cort");


        }else{
            System.out.println("go shopping!!");
            System.out.println("buy icecream");
            System.out.println("enjoy your day");
        }
        System.out.println("THE END");

    }
}
