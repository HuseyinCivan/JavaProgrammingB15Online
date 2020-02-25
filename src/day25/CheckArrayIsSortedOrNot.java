package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

     int[] nums={13,31,8,5,21,2}   ;

        System.out.println("nums = "+ Arrays.toString(nums));
     int numsItemCount = nums.length;

     // i want to copy the content of nums array into the new array

        //creating an aary with same size as iriginal array
     int[] numsCopy=new int[numsItemCount];

//        numsCopy[0]= nums[0];           //13;
//        numsCopy[1]= nums[1];           //31;
//        numsCopy[2]= nums[2];           //8;
//        numsCopy[3]= nums[3];           //5;
//        numsCopy[4]= nums[4];           //21;
//        numsCopy[5]= nums[5];          //2;

        for(int x=0;x<nums.length;x++){
            numsCopy[x]= nums[x];
        }

        System.out.println("BEFORE SORT numsCopy = "+ Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);

        System.out.println("AFTER SORT numsCopy = "+ Arrays.toString(numsCopy));

        //CHECK WHETGHER THE ARRAY HAVE SAME CONTENT IN SAMA ORDER AFTRE SORTING

        if( Arrays.equals(nums,numsCopy)){
            System.out.println("ALREADY SORTED");
        }else{
            System.out.println("ALREADY NOT SORTED");
        }











    }
}
