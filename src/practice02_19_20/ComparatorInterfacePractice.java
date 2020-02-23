package practice02_19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacePractice {
    public static void main(String[] args) {

        List<Person> plst = new ArrayList<>();
        plst.add(new Person("John",20));
        plst.add(new Person("John",10));
        plst.add(new Person("Adam",32));
        plst.add(new Person("Mary",15));
        System.out.println("plst = " + plst);

        Collections.sort(plst);
        System.out.println("plst = " + plst);
        //Collections.sort(plst,c);
        Comparator<Person> comp = new PersonNameComparator(); // Comparator of person. comes from java.util

        Collections.sort(plst,comp);
        System.out.println("plst SORT BY NAME= " + plst);

        Comparator<Person> ageComparator =
        Comparator.comparing(p -> p.age );

        Collections.sort(plst,ageComparator);
        System.out.println("plst SORT BY AGE = " + plst);

        Comparator<Person> nameComparator =
                (o1,  o2) -> o1.name.compareTo(o2.name);
        Collections.sort(plst,nameComparator);
        System.out.println("plst NAME COMPARATOR= " + plst);

        Comparator<Person> nameReverseComparator =
                (o1,  o2) -> o2.name.compareTo(o1.name);
        Collections.sort(plst,nameReverseComparator);
        System.out.println("plst NAME REVERSE COMPARATOR= " + plst);

        Comparator<Person> nameRThenAgeComp =
                nameReverseComparator.thenComparing(ageComparator.reversed());
        Collections.sort(plst,nameRThenAgeComp);
        System.out.println("nameRThenAgeComp = " + plst);












    }
}
