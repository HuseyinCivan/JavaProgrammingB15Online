package day64.review;

import java.util.*;

public class MapKeySetView {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);




//        groceryPriceMap.forEach((name,price)-> System.out.println("name is = " +name +" price is "+price ));
//
//        Set<String > allNames=groceryPriceMap.keySet();
//        Collection<Double> allValues = groceryPriceMap.values();




        Set<Map.Entry<String ,Double>> entryGrocery = groceryPriceMap.entrySet();
        System.out.println("entryGrocery = " + entryGrocery);

        for (Map.Entry<String, Double> each : entryGrocery) {

            if(each.getValue()>2){
                each.setValue(15.0);
            }
            System.out.println(each.getKey());
            System.out.println(each.getValue());

        }






//        Set<String>allNames=groceryPriceMap.keySet();
//        System.out.println("allNames = " + allNames);
//
//        Iterator <String > iterAllNames=allNames.iterator();
//
//       while (iterAllNames.hasNext()){
//           String currentChar = iterAllNames.next();
//           if(currentChar.equals("Tomato")){
//               currentChar="Tomatis";
//           }
//           System.out.println("currentChar = " + currentChar);
//       }
//
//
//        Set<Map.Entry<String, Double>> entrySetGrocery = groceryPriceMap.entrySet();
//        System.out.println("groceryPriceMap.values() = " + groceryPriceMap.values());
//        System.out.println("groceryPriceMap.keySet() = " + groceryPriceMap.keySet());
//
//        for (  Map.Entry<String, Double>  eachItem :entrySetGrocery){
//
//            System.out.println(eachItem.getKey());
//            System.out.println(eachItem.getValue());
//
//            if(eachItem.getKey().length()==5){
//                eachItem.setValue(15.0);
//            }
//
//
//
//        }
//        System.out.println("groceryPriceMap = " + groceryPriceMap);


//        Iterator<Map.Entry<String, Double>> iterEntrySet = entrySetGrocery.iterator();
//
//        System.out.println("iterEntrySet = " + iterEntrySet);
//        while (iterEntrySet.hasNext()){
//            System.out.println("item is = " + iterEntrySet.next());
//        }










    }
}
