package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReversingAList {
    public static void main(String[] args) {



        ArrayList<Integer> nums1=new ArrayList<>(Arrays.asList(200,100,700,400,500));

        // 200, 100, 700, 400, 500
        //after reversing
        //500,400,700,100,200

        //after sorting in reverse order line 13,
        //700,500,400,200,100


        System.out.println("nums1 BEFORE REVERSING = " + nums1);
        Collections.reverse(nums1);
        System.out.println("nums1 AFTER REVERSING= " + nums1);

        System.out.println("_________________________");
        System.out.println("nums1 BEFORE SORTING REVERS ORDER = " + nums1);
        Collections.sort(nums1,Collections.reverseOrder());  // OR Comparator.reverseOrder();
        System.out.println("nums1 AFTER SORTING REVERSE ORDER = " + nums1);







    }
}
