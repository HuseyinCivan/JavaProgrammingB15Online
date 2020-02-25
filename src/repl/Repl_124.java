package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_124 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int[] nums ={4, 3, 2, 44, 1, 100, 55};
        int temp;
        for( int x=0;x<= nums.length/2  ;x++    ){

            temp=nums[x];
            nums[x]=nums[nums.length-1-x];
            nums[nums.length-1-x] = temp;

        }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}
