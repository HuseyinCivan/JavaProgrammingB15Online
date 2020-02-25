package day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {

        long[] myLongs={ 6L,11L,44L,32L,65L };
        System.out.println("before-myLongs = " + Arrays.toString(myLongs));

      swampFirstAndLastValue(myLongs);
        System.out.println("after-myLongs = " + Arrays.toString(myLongs));

    long[] myNums1=new long[5];
        System.out.println("myNums1 = " +Arrays.toString( myNums1));
    Long[] myNums2=new Long[5];
        System.out.println("myNums2 = " +Arrays.toString( myNums2));









    }



//write a static void method to accept a long array.
//It should swamp first value with last value of the array



    public static void swampFirstAndLastValue(long[] nums) {
    //nums[0] , nums[nums.length-1 ]

        long temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;

    }

}
