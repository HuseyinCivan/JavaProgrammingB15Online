package day12;

import java.util.Scanner;

public class CarShopping {
    public static void main(String[] args) {

       // Scanner scan=new Scanner(System.in);

        // Buy corolla(DOES NOT MATTER WHATS YOUR BUDGET)
        // or
        // Tesla (only if it's within the budget THIS CONDITION ONLY APPLY FOR TESLA)
        // there is only one car covered with cloth
        // we don't know what car is it and what is the price
        //  once we take out the cloth
        // we check whether its toyota , if it's we buy it without checking the price
        // if it's not, we check if its a Tesla and also check whether it is within the budget
        // else we just say not what we are looking for


        String carBrand="Tesla";
        int carPrice=30000;
        //carBrand=scan.next();

        double budget= 40000;

//        if (carBrand.equals("corolla") || (carBrand.equals("Tesla") && carPrice<= budget)   ){
//
//            System.out.println(" Car Acquired !!!");
//
//        }
//        else{
//            System.out.println("not what i am looking for");
//        }
        if(carBrand.equals("corolla")){
            System.out.println("COROLLA CAR ACQUIRED!!!");
        }else if(carBrand.equals("Tesla") && carPrice<=budget){
            System.out.println("TESLA CAR ACQUIRED!!!");
        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }

    }
}
