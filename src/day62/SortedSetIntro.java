package day62;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {

        //
        SortedSet<Integer> mySet= new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);

        System.out.println("mySet = " + mySet);
//there are few extra method available in sorted set because it's already sorted
        System.out.println("first element is the min in sorted order = " + mySet.first());
        System.out.println("last  element is the max in sorted order = " + mySet.last());


    }
}
