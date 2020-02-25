
package repl;
import java.util.*;


public class Repl_188 {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{45,458,4789,4568,455,8445,47456}));

    }


    public static int findMax(int[] nums) {
        int max = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > max) {
                max = nums[x];
            }
        }
        return max;
    }

    public static double findMax(double[] nums) {
        double max = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > max) {
                max = nums[x];
            }
        }
        return max;
    }
}