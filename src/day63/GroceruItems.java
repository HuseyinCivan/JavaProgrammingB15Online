package day63;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a Map of grocery items
 * String , Double
 * // add 7 items :
 * // try to add duplicate keys and see
 * // try to use putIfAbsent
 * // print them out in one shot
 * // Observe if there is any predictable order
 * // get the 3rd item value and print
 * // double the price of the first and last item
 * // try to remove tomato
 * // OPTIONALLY : USING THE PREVIOUS CLASS STRING
 * // TRY TO GET A charFrequencyMap
 * // your map should store character and it's frequency
 * //  AAABBCDDDD  -->> {'A'=3 , 'B'=2 , 'C'=1 ,'D'=4 ,  }
 */
public class GroceruItems {
    public static void main(String[] args) {

        // Map<String ,Integer > nameAgePair = new HashMap<>();

        Map<String,Double> groceryItems = new HashMap<>();

        groceryItems.put("Nutella",11.99);
        groceryItems.put("Cheese",7.19);
        groceryItems.put("Tomatos",2.99);
        groceryItems.put("Avacado",5.49);
        groceryItems.put("Patatoes",2.11);
        groceryItems.put("Brocoli",3.49);
        groceryItems.put("Strawberry",11.99);

        groceryItems.put("Tomatos",2.49);
        groceryItems.put("Brocoli",3.99);
        groceryItems.put("Brocoli",2.99);
        groceryItems.put("Avacado",4.49);

        System.out.println("groceryItems = " + groceryItems);

        groceryItems.putIfAbsent("Nutella",7.99);
        groceryItems.putIfAbsent("Apple",1.49);
        groceryItems.putIfAbsent("Garlic",0.99);

        System.out.println("groceryItems = " + groceryItems);

        System.out.println("groceryItems.get(\"Nutella\") = " + groceryItems.get("Nutella"));

        System.out.println("groceryItems.replace(\"Apple\",1.49,(1.49*2)) = " + groceryItems.replace("Apple",1.49,(1.49*2)));
        System.out.println("groceryItems.replace(\"Patatoes\",2.11,groceryItems.get(\"Patatoes\").doubleValue()*2) = "
                + groceryItems.replace("Patatoes",2.11,groceryItems.get("Patatoes").doubleValue()*2)); //groceryItems.get("Patatoes") *2

        System.out.println("groceryItems = " + groceryItems);


        System.out.println("groceryItems.containsKey(\"Tomatos\") = " + groceryItems.containsKey("Tomatos"));
        groceryItems.remove("Tomatos");
        System.out.println("groceryItems.containsKey(\"Tomatos\") = " + groceryItems.containsKey("Tomatos"));













    }
}
