package day64.review;

import java.util.*;

public class MapContinue {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        System.out.println("groceryPriceMap.keySet() = " + groceryPriceMap.keySet());
        System.out.println("groceryPriceMap.values() = " + groceryPriceMap.values());
        System.out.println("groceryPriceMap.entrySet() = " + groceryPriceMap.entrySet());

        System.out.println("________________________");

        Set<String> keyGrocery =groceryPriceMap.keySet();
        System.out.println("keyGrocery = " + keyGrocery);
        Set<String> copyGrocery=new HashSet<>(keyGrocery);

        keyGrocery.remove("Tomato");
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        System.out.println(copyGrocery);







    }


}
