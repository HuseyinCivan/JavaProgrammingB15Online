package day13;


import jdk.swing.interop.SwingInterOpUtils;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {




        /*
         * Amazon has 2 type of user one is Prime member and another is regular member
         * prime member get free shipping in all purchase no matter the amount
         * regular member user get free  shipping only if their purchase is more than 25$
         * otherwise they get 5$ shipping fee
         *
         * */

        String memberType=" Member";
        double amount=45.99d;
        int shippinFee=0;


        //firt I want to check it is prime member or not
        if(memberType.equalsIgnoreCase("PRIME MEMBER")){
        System.out.println("YOU GET 1 DAY FREE SHIPPING");
        System.out.println("Your final price is "+amount);}

        //else if(amount>25){
        else if(!memberType.equalsIgnoreCase("PRIME MEMBER") && amount>25){

            System.out.println("NOT A PRIME MEMBER BUT YOUR ORDER IS MORE THAN 25");
            System.out.println("YOU GOT FREE SHIPPING ON AMONT "+amount);

        }else{
            System.out.println("DO YOU WANNA SIGN UP FOR PRIME MEMBERSHIP? ");
            shippinFee=5;
            amount=amount+shippinFee;  //amount+=shippingFee
            System.out.println("YOUR FINAL AMOUNT IS "+amount);

        }








    }
}
