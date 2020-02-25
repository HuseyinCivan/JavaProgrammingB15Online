package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {


        System.out.println(getListFrom1ToFinalNUmber(7));
        System.out.println(getListFrom1ToFinalNUmber(2));
        System.out.println(getListFrom1ToFinalNUmber(20));

        List<Integer> myList=getListFrom1ToFinalNUmber(25);

    }

    //create a method that accept a finalNumber as int
    //return an ArrayList of Integer containing  numbers
    //starting from 1 till finalNumber

    public static List<Integer> getListFrom1ToFinalNUmber( int finalNumber   ){
        List<Integer> nums = new ArrayList<>();
        for (int numbers = 0; numbers <= finalNumber ; numbers++) {
            nums.add(numbers);
        }
        return nums;
    }


}
