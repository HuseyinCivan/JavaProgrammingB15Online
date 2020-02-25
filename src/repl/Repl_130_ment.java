package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_130_ment {
        //Modify an array that is "left shifted" by one --
        // so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
        // You may modify and print the given array, or print a new array.
        //Example:
        //input: 6, 2, 5, 3
        //output: [2, 5, 3, 6]

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i = 0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE

            //lets use this example to figure out


            //  0  1  2  3    index num
            //  6, 2, 5, 3    nums
            //  2, 5, 3, 6    shifted version
//int nums[]={6, 2, 5, 3};
            int[] shiftedArr=new int[nums.length];

            //x=0;
//            shiftedArr[0]=nums[1]; ========> shiftedArr[x]=nums[x+1]
//            shiftedArr[1]=nums[2]; ========> shiftedArr[x+1]=nums[x+1+1]
//            shiftedArr[2]=nums[3]; ========> shiftedArr[x+1+1]=nums[x+1+1+1]

//            shiftedArr[3]=nums[0];

            for (int x = 0; x <nums.length-1 ; x++) {
                shiftedArr[x]=nums[x+1];

            }
            shiftedArr[shiftedArr.length-1]=nums[0];

            System.out.println(Arrays.toString(shiftedArr));

        }
    }


