package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {
        List<Double> priceList= new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);

        //change the third price to 10$
        priceList.set( 2,10.0 );
        System.out.println("priceList.get(2) new price = " + priceList.get(2));

        //add 4$ to first price : your first price value should be original price +4
        priceList.set(0,priceList.get(0)+4);
        System.out.println("priceList.get(0) new price = " + priceList.get(0));


        //change last price to sum of first and second price
        double sumOfFirst2Items= priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1,sumOfFirst2Items);
       // priceList.set(priceList.size()-1, priceList.get(0) + priceList.get(1));

        System.out.println("priceList.get(last item) new price = " + priceList.get(priceList.size()-1));


        //give %40 off to second price

        priceList.set(1,priceList.get(1)  * 0.60  );
        System.out.println("priceList.get(second item) new price = " + priceList.get(1));

        //double the value of each and every price in the list
        System.out.println("priceList BEFORE = " + priceList);

        for (int x = 0; x <priceList.size() ; x++) {
            priceList.set( x,  ( priceList.get(x)*2 )   );

        }
        System.out.println("priceList AFTER = " + priceList);


        //cut the price into half if the price is more than $20,

        for (int x = 0; x <priceList.size() ; x++) {
            if(priceList.get(x)>20){
                priceList.set(x,priceList.get(x)/2);
            }

        }
        System.out.println("priceList = " + priceList);

        //swap the first value with the last value

        Double temp = priceList.get(0);
        priceList.set(0,priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);
        System.out.println(priceList);









    }
}
