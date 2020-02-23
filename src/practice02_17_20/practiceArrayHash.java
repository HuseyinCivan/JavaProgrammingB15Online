package practice02_17_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practiceArrayHash {
    public static void main(String[] args) {

        ArrayList lst= new ArrayList();
        ArrayList<String > lst2= new ArrayList<>();



        lst.add("Huseyin");
        lst.add("Seda");
        lst.add(10);
        lst.add(10.55);
        lst.add('a');
        lst.addAll(new ArrayList(Arrays.asList("Civan",10,20,null)));

        System.out.println("lst = " + lst);

        System.out.println("lst.size() = " + lst.size());










    }
}
