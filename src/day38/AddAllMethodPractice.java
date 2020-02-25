package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAllMethodPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);
        System.out.println("nums1 BEFORE = " + nums1);
        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

        //add all nums2 items into nums1

        nums1.addAll(nums2);
        System.out.println("nums1 AFTER= " + nums1);

        //add 4 items to nums2 using all 100,200,300,400

        nums2.addAll(Arrays.asList(100,200,300,400));
        System.out.println("nums2 AFTER adding 4 items = " + nums2);
    }
}
