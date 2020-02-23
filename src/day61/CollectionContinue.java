package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {


        // Collectin interface as super type , pointing to and Arraylist object
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8));
        System.out.println("nums = " + nums);

        Collections.sort(  (List<Integer>) nums     );  //--> cast to (List<Integer>)
       // System.out.println("nums = " + nums);


        // can we get method when we have collection as reference type?/
        // no!!!  only reference type decide what we can access


        List<Integer> nums2= new ArrayList<>(Arrays.asList(10,7,4,11,67,8));

        // i want to sort this collection

        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);












    }


}
