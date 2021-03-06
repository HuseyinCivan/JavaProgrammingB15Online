package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItemPractice {
    public static void main(String[] args) {


        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println("lst = " + lst);

//        lst.remove(3);
//        System.out.println("lst AFTER removing index 3 item = " + lst);

        //i want to remove item by its value rather than index
        lst.remove(Integer.valueOf(2));
        System.out.println("lst = " + lst);


//if you try to delete using index list dont have
        //it will throw IndexOutOfBoundsException
        //lst.remove(112)


        //if you try to delete an item that does not exist by value
        //it will do nothing
        lst.remove(Integer.valueOf(112));
        System.out.println(lst);









    }
}
