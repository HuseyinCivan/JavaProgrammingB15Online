package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {


        // initializing (giving value) offerCount to 2
        int offerCount=2;
        // increasing the number by 1 using normal way
       // offerCount=offerCount+1;

        // this is increasing value by one using compount /shorthand operator
       // offerCount+=1;

        //since increasing or decreasing a value is very special
        //and ofte used in programmin
        // There is even shorter shortcut for thios operation
        //and we use ++ or -- ,THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        //we can not use it for any other time like increasing or decreasing value by more than one

        ++ offerCount;   //this is same as both(above) . it is just shorter
        System.out.println("Offer now incerasing by one "+offerCount);

        --offerCount;
        System.out.println("Offer now decreasing by one "+offerCount);








    }
}
