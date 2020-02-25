package day36;

import java.util.ArrayList;

public class ArayListMethods2 {
    public static void main(String[] args) {


        //cretae a ArrayList object of long and assign in to a varable

        ArrayList<Long> lst= new ArrayList<>();

        //C.R.U.D.

        //add item ,insert an item,  read item, update item, remove the item, check the location ...

        lst.add(  12L  ); //12L is automatically converted to new Long(12L) : because Arraylist only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        lst.add(null);

        System.out.println(lst);

        //i want to insert 125 between 100L and 150L, basically 2nd and 3rd item

        lst.add(2,125L);
        System.out.println("lst = " + lst);
        System.out.println(lst.get(3));

        //updating value at certain index :set method
        lst.set(3,195L);
        System.out.println("new value of lst(3) = " + lst.get(3));

        //removing item by its value
        lst.remove(100L);
        System.out.println("lst after removing 100 = " + lst);

        //removing item by its index

        lst.remove(2);
        System.out.println("lst after removing index 2 = " + lst);

        //looking for location of certain item,
        System.out.println("location of 12L is using lst.indexOf(12L) = " + lst.indexOf(12L));
        System.out.println("location of 23L is using lst.indexOf(23L) = " + lst.indexOf(23L));   //--->no ! -1 !!


        //check whether a list is empty or not
        System.out.println("lst.isEmpty = " + lst.isEmpty());

        System.out.println("lst.size()>0 = " + (lst.size()>0) );

        //check whether we have certain item or not

        System.out.println("lst.contains(100L) = " + lst.contains(100L));
        System.out.println("lst.contains(10L) = " + lst.contains(10L));

        //how do i check whether a list contains an item without using contains method,
        //use indexof method, if it return -1, it means we dont have it

        System.out.println("(do i have 10L = " + (lst.indexOf(10L)!=1));












    }
}
