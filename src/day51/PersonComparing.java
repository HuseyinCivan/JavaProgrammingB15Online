package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {
        Person p1=new Person("Arafat",34);
        Person p2=new Person("Zhibek",17);
        Person p3=new Person("Asena",18);
        System.out.println("---------------------");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("---------------------");

        //print out the name of younger person between p1 and p3
        //it is asked to use compareTo method we just created

        if(p1.compareTo(p3)==1){
            System.out.println(p3.name);
        }
        else{
            System.out.println(p1.name);
        }
        System.out.println("---------------------");
        System.out.println("---------------------");


        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Jon Snow",27));
        System.out.println(lst);

        // ANYTHING WE SORT MUST BE A TYPE OF COMPARABLE
        System.out.println("________SORT_______");
        Collections.sort(lst);
        System.out.println("lst = " + lst);

        System.out.println("---------------------");
        System.out.println("---------------------");










        //compare p1 and p2 by age
        //if p1 is older print 1;
        //if they are same age print 0;
        //if p2 is older print -1;
        System.out.println("_______________________");

        if(p1.age>p2.age){
            System.out.println("1");
        }
        if(p1.age==p2.age){
            System.out.println("0");
        }
        if(p2.age>p1.age){
            System.out.println("-1");
        }

        System.out.println("p1.compareTo(p2) = " + p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));

        System.out.println("-------------------");
        int result=p1.compareTo(new Person("seda",18));
        System.out.println(result);


        String a="a";
        a.toLowerCase().substring(0,1).toUpperCase();
        a=a.toLowerCase();
        a=a.substring(0,1).toUpperCase() + a.substring(1);
        System.out.println("a = " + a);

    }



}
