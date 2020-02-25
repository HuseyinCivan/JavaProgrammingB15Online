package repl;

import java.util.Arrays;

public class Repl_122 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 4, 3, 2};
//
//        for (int x = 0; x <= nums.length-1; x++) {
//            int counter = 0;
//            for (int y = 0; y <= nums.length-1; y++) {
//                if (nums[x] == nums[y]) {
//                    counter++;
//                    if (counter != 2) {
//                        System.out.println(nums[x]);
//                }
//            }
//
//            }
//        }
//
//    }
//}
        for (int i = 0; i < nums.length; i++) {
            int equalCount = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    equalCount++;
                }
            }
            if (equalCount == 1) {
                System.out.println(nums[i]);
                break;
            }
        }
    }
}