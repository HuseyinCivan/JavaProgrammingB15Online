package day64.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<String> allNames = groceryPriceMap.keySet();

        for(String eachNames : allNames){
            System.out.print("eachNames = " + eachNames);
            System.out.println(" and the price is = "+groceryPriceMap.get(eachNames));
        }















    }
}
