package day64.review;

import java.util.*;

public class Map_valuesView {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        Collection<Double> allPrices=groceryPriceMap.values();
        for (Double eachPrice : allPrices){
            System.out.println("eachPrice = " + eachPrice);
        }

        allPrices.removeIf(each-> each>3);
        System.out.println("allPrices AFTER REMOVE >3 WITH LAMBDA  = " + allPrices);


//        Iterator<Double> iterAllPrices = allPrices.iterator();
//
//        while (iterAllPrices.hasNext()){
//            double curretPrice = iterAllPrices.next();
//
//            if(curretPrice>3){
//                iterAllPrices.remove();
//            }
//        }






        //allPrices.remove("1.99");

        List<Double> copyPrices = new ArrayList<>(allPrices);
        System.out.println("copyPrices = " + copyPrices);

        for (int x = 0; x < copyPrices.size() ; x++) {
            if(copyPrices.get(x)>3.00){
                copyPrices.remove(x);
            }

        }
        System.out.println("copyPrices AFTER REMOVE >3 = " + copyPrices);


        System.out.println("\n______________________\n");

        Set<String > allNames = groceryPriceMap.keySet();
        for (String eachName : allNames){
            System.out.println("eachName = " + eachName);
        }


    }
}
