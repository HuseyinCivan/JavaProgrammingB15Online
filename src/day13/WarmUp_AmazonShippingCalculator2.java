package day13;


public class WarmUp_AmazonShippingCalculator2 {
    public static void main(String[] args) {

        //create a boolean store the result of doYouWantShop
        //if yes, do you want to go to Store do you wanna shop online

        //if user do not wqnna shop at all, print good job stay home coding !!!

boolean youWantToShop=true;
String preference="Store";

    if(youWantToShop==true){
        //if(youWantToShop)
       if(preference.equals("Store")){
           System.out.println("GOING TO STORE FOR SHOPPING");
       }else{
           System.out.println("GOING TO ONLINE FOR SHOPPING");
       }

    }else{
        System.out.println("good job stay home coding !!!");
    }






    }
}
