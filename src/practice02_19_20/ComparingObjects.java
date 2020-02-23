package practice02_19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingObjects {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();

        lst.add("Adam");
        lst.add("John");
        lst.add("Mary");
        lst.add("Diana");

        System.out.println("lst = " + lst);
        Collections.sort(lst);
       // Collections.sort(lst, Collections.reverseOrder());
       // Collections.sort(lst, Comparator.reverseOrder());
       // Collections.sort(lst, Comparator.naturalOrder());

        System.out.println("lst = " + lst);

        List<Person> plst = new ArrayList<>();
        plst.add(new Person("John",20));
        plst.add(new Person("John",10));
        plst.add(new Person("Adam",32));
        plst.add(new Person("Mary",10));

        System.out.println("BEFORE SORT plst = " + plst);

        Collections.sort(plst);
        System.out.println("AFTER  SORT plst = " + plst);



















    }
}
