package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tets {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        System.out.println(list1);

        list1.remove(3);
        System.out.println(list1);

       // list1.clear();
        list1.removeAll(list1);
        System.out.println(list1);

//        List<Integer> list2 =Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
//        list2.remove(0);
//        System.out.println(list2);

        System.out.println("practices========================================================");


        String[] names = {"Sherinay", "Denis", "Nurzat", "Seyfo", "Seyfo", "Seyfo", "Mehmet"};
        ArrayList<String>  a = new ArrayList<>( Arrays.asList( names ) );
        a.remove(0);
        System.out.println("a = " + a);


        ArrayList<String> b = new ArrayList<>( Arrays.asList( "huseyin","sede" ) );
        b.remove(0);
        System.out.println("b = " + b);


        List<String> c = new ArrayList<>(Arrays.asList("civan","demirr"));
        System.out.println(c);
        c.remove(1);
        System.out.println("c = " + c);


        List<String> d = (Arrays.asList("avalon","alpharetta"));
        d.remove(0);
        System.out.println("d = " + d);



    }
}