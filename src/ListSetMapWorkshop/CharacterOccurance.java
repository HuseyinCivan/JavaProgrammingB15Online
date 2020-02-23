package ListSetMapWorkshop;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

    public static void main(String[] args) {


        String str = "masdam";
        Map<Character, Integer> occuranceMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            int existingOccurance = occuranceMap.getOrDefault(c,0);
            occuranceMap.put(c, ++existingOccurance );
        }
       // occuranceMap.forEach(key,value)->System.out.println()


    }

}
