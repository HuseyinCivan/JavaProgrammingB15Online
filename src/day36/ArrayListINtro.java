package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListINtro {
    public static void main(String[] args) {

    //how do we create a ArrayList Object?

        ArrayList<String> lst1=new ArrayList<>();
        //IT WILL ONLY STORE OBJECT!!! NOT PROMITIVE

        //ArrayList<int> lst2 = new ArrayList<>()     ;
        //corect way to cretae arraylist object that store whole number
        //is to use wrapper clss type. primitive type is FORBIDDEN

        ArrayList<Integer> lst2=new ArrayList<>();

        ArrayList<Long> lst3=new ArrayList<>();

        // OPTIONALLY YOU CAN CREATE IN THIS WAY

        // List is a more general data type  compared to ArrayList is more concrete data type
        // ArrayList is one type of List
        // Just like Dog is one type of Animal


        List <String> myList= new ArrayList<>();



    }
}
