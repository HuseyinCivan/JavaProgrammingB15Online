package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class SetOfUniqueStates_Deleting {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
 //       states.removeIf(each ->each.contains("A"));
        System.out.println("states = " + states);

//        states.remove("GA");
//        System.out.println("states = " + states);

        // remove all the states with letter A

//        states.removeIf(each -> each.contains("A"));
//        System.out.println("states = " + states);

        Iterator<String > stIterator = states.iterator();

        while (stIterator.hasNext()){
            if(stIterator.next().contains("A")){
                stIterator.remove();
            }
        }
        System.out.println("states = " + states);











    }
}
