package day38;

import java.util.*;

public class SortingAList {
    public static void main(String[] args) {


        List<Integer> nums =new ArrayList<>(Arrays.asList(300,200,700,600,800));

        // 2 ways to sort an arrayList object
        // Use Collections utility class ( just like Arrays utility class for Array objects )
        //Collection is a class coming from java.util package
        // it has a lot of ready method to work with Collection objects like ArrayList and so on



        System.out.println("nums BEFORE SORT= " + nums);
        Collections.sort(nums);
        System.out.println("nums AFTER SORT= " + nums);


        // this version of sort merthod accept 2 argument
        // 1st is the list to be sorted
        //2nd Comparator Object that contains comparing logic
        //good news is there is ready method already in Java
        //Comparator.reverseOrder() , just take  it and use it !
        Collections.sort(nums,Comparator.reverseOrder());  //decending order a gore siralar....buyukten kucuge
        System.out.println("nums = " + nums);

        // list itself also has sort method that accept one Comparator Object
        // simple way to get Comparator objects are
            // Comparator.naturalOrder()--> low to high order
            // Comparator.reverseOrder()--> high to low order

        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after ums.sort(Comparator.naturalOrder()); = " + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after nums.sort(Comparator.reverseOrder());()); = " + nums);















    }
}
