package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");

        superHeros.add("Cyborg");  //when we remove Cyb
        superHeros.add("Aquaman");
        superHeros.add("Flash");
        superHeros.add("Wonder Woman");
        System.out.println("superHeros = " + superHeros);
//Do we have a superman in the list?
        System.out.println("superHeros.contains(\"Superman\") = " + superHeros.contains("Superman"));
      
        //does this contains an item with exact value of man      
        System.out.println("superHeros.contains(\"man\") = " + superHeros.contains("man"));
        
        //remove any heroes that does not have man in the String

        for (int x = 0; x < superHeros.size(); x++) {
            String currentHero=superHeros.get(x);

            if(! currentHero.contains("man")){
                superHeros.remove(currentHero);  //----> (x) de olur !
                --x;
            }


        }
        System.out.println("superHeros = " + superHeros);


        List<String> superHeroCopy = new ArrayList<>(superHeros);
        System.out.println(superHeroCopy);



        List<String> topics= Arrays.asList("Java", "Selenium", "Database","API");
        System.out.println("topics = " + topics);

        List<String> topicCopy = new ArrayList<>(topics);
        System.out.println("topicCopy = " + topicCopy);






    }
    
  
    
    
    
    
    
    
}
