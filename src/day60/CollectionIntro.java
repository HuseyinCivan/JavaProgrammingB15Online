package day60;

import java.util.*;

public class CollectionIntro {
    public static void main(String[] args) {

   // List<String > names = new ArrayList<>();

    //List interface extends Collection interface
    //and ArrayList implements List interface
    //So we can safely say Araylist IS-A Collection
    Collection<String> names = new ArrayList<>();
    // with this assignment we ca access only what Collection interface have
    // so we ca learn what any type of Collection including Set, Queue , List have in common
     names.add("Hasan");
     names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");

        names.addAll(names); // addAll method parameter type is Collection(interface) so we can pass anything IS-A Collection

        names.remove("Hasan");
        System.out.println("names = " + names);

        names.removeAll(Arrays.asList("Sevim"));
        System.out.println("names after removeAll Sevim = " + names);

        names.addAll(Arrays.asList("Seda","Huseyin"));
        System.out.println("names = " + names);

        for (String eachNames : names) {
            System.out.println("eachNames = " + eachNames);
        }

        Collection<String> toRemove =new ArrayList<>(Arrays.asList("Hasan","Abdullo")) ;    //Arrays.asList("Hasan","Abdullo") immutable type
        toRemove.add("Lorin");
        System.out.println("toRemove = " + toRemove);

        names.removeAll(toRemove);
        System.out.println("AFTER REMOVE ALL toRemove names = " + names);

      //  System.out.println("first item "+names.get(0));

        System.out.println("________________________________________");
        //optionally this is how we can use forEach method to print out everything in one shot
        names.forEach( each -> System.out.println("each = " + each));









    }
}

/*
 * The word Collection everywhere :
 *
 *
 * Collection Framework -->> referring entire things , entire topic
 *
 * Collection Interface --->> one interface under the entire Collection Framework
 *
 * Collections class  -->> (it has s at the end, just like Array and Arrays )
 *                   -->>  is a utility class with many static methods
 *                 for example : Collections.sort(your collection object1)
 *
 *
 * */