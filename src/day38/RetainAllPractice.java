package day38;

import java.util.ArrayList;
import java.util.Arrays;

//Retains only the elements in this list that are contained in the specified collection.
//In other words, removes from this list all of its elements that are not contained in the specified collection
public class RetainAllPractice {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);

        ArrayList<Integer> nums2=new ArrayList<>(Arrays.asList(200,300,600,700,800));

        System.out.println("nums1 BEFORE= " + nums1);
//THIS WILL ONLY KEEP THE COMMON PART OF 2
        nums1.retainAll(nums2);

        System.out.println("nums1 AFTER = " + nums1);

        nums2.retainAll(nums1);
        System.out.println("nums2 AFTER = " + nums2);

        //in order to check whether 2 list objects has same elements in same order  we can use .equal method
        System.out.println(nums1.equals(nums2));
















    }
}
