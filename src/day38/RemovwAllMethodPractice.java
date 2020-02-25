package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovwAllMethodPractice {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);
        nums1.add(600);

        // i want to remove 100,300
        //just like addAll , removeAll medhod wxpect another collection| list object to be removed
        System.out.println("nums1 BEFORE = " + nums1);
        nums1.removeAll(Arrays.asList(100,300)  );
        System.out.println("nums1 AFTER = " + nums1);

        nums1.removeAll(List.of(100,400));  // what if i dont have 100  ? --nothing changed for 100, 400 removed
        System.out.println("nums1 = " + nums1);

        nums1.removeAll(Arrays.asList(600));
        System.out.println("nums1 AFTER remove all 600 = " + nums1);  //removes all 600 , not only first













    }
}
