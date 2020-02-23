package day61;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        //Array is backed by array in the back
        //so if you have Arraylist with 4 elements
        //in the back we have array with size 4 holding all those elements

       // List<String> lst = new ArrayList<>();

        //linked list is backed by something called Node,
        //see it as 4 people holding hands
                //the neighhbouring person have pointer to previous an dnext person
        //because


        List<String> lst = new LinkedList<>();

        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");

        lst.remove("Ershat");
        System.out.println("lst = " + lst);













    }
}
