package day64.review;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();

        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
//        groceryPriceMap.putIfAbsent("Fish", 12.99);
//        groceryPriceMap.putIfAbsent("Apple", 100.0);

        System.out.println("groceryPriceMap = " + groceryPriceMap);





    }
}
