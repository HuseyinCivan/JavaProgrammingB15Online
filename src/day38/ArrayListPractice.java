package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {


        //create a list of 6 double in short way, we will just read them and will not add or remove item

       List <Double> prices=Arrays.asList(9.99,5.55,3.76,8.99,0.99,65.67,0.99);
       //List <Double> prices=List.of(9.99,5.55,3.76,8.99,0.99,65.67);

       //prices.add(12.8);
        //prices.remove(0);

        int count=0;
        for (Double each : prices) {
            if(each>5) {
                count++;
            }
        }
        System.out.println("count = " + count);

//i want ti add 2 more prices ( dors not have to be same list)
        ArrayList<Double> newPrices=new ArrayList<>(prices);
        System.out.println("newPrices OLD = " + newPrices);
        newPrices.add(199.9);
        newPrices.remove(0.99);  // remove method will remove first occurance of the value
        System.out.println("newPrices NEW= " + newPrices);


        //create a ArrayList Object in one shot with many items so we can add or remove

        //just one option to create ArrayList Object in one shot
        ArrayList<Double> oneShotPrice=new ArrayList<>( Arrays.asList(9.99, 5.55, 3.76, 8.99));
        System.out.println("oneShotPrice BEFORE = " + oneShotPrice);

        //Add 100.99 after 9.99;
        oneShotPrice.add(1,100.99);
        System.out.println("oneShotPrice AFTER ADDING 100.99= " + oneShotPrice);
        //remove item 3
        oneShotPrice.remove(2);

        System.out.println("oneShotPricen AFTER REMOVING 3. ITEM = " + oneShotPrice);





    }
}
