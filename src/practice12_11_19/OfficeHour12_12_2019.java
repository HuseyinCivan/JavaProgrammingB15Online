package practice12_11_19;

import java.util.Arrays;

public class OfficeHour12_12_2019 {
    public static void main(String[] args) {
      //12/12/2019
        //Practice: Array
        //          String
        //          Loop
        //Array: one of the data structures in java
        //        we need data structures to manage data efficientlly, in organized manner
        //        we can store multiple data into a variable
        //            int a = {10,20}  ==>wrong
        //        decleration:
        //                Data-type[] VariableName ={data, data, ...}
        //                    index:                  0     1    ...
        //            retrive data from array:
        //                    VariableName[index]
        //                        Ex: int[] arr ={1,2,3}
        //                                arr[2]  ==> 3
        //        Array is immutable, and Array' size is fixed
        //            without initializing array's size we cannot use it
        //        initializing the size of the array:
        //                1. giving values
        //                        int[] a ={1,2,3}
        //                        it initialize the size and at the same time initializes the value
        //                2. giving the size of the array only:
        //                        int[] a = new int[LengthNumber]
        //    Arrays: presented in java.util package
        //        Arrays.toString(VariableName): converts any data type of Array to String , returns String
        //        Arrays.sort(VariableName): sorts the elements within the array in ascending order, does not return anying
        //String class' split method:
        //        str.split("StringValue"): splits the string by given value, and returns it as String array
        //                String[] arr = "ABCD".split(""); ==> {A, B, C, D}
        //        str.toCharArray(): Assign the String to char array. returns char array
        //default values:
        //    byte, short, int, long ==> 0
        //    String => null
        //    double, float ==> 0.0
        //    boolean ==> false
        //Tasks:
        //    1.  Write a program that can print out the unique values from an int Array
        //        Ex:
        //            if arr -> {1, 1, 2 , 3, 3}
        //              output: 2
        //    2. Write a program that can print out the unique values from  String Array
        //        Ex:
        //            if arr -> {"a" , "a ", "b", "c", "c"}
        //                output: b
        //    3. Write a program that can find the second max number from an int array
        //        Ex:
        //            if arr -> { 1,2,3,4,5}
        //                output: 4
        //            DO NOT use sort method
        //
        //    4. Swap two variable' values without using a temporary variable
        //        Ex:
        //            if a =10, b= 20;
        //                output: print( a ) ==> 20
        //                        print( b ) ==> 10

            int[] arr = {1, 2, 3};// ==>3
            arr = new int[4];
            System.out.println(Arrays.toString(arr));
            // 1, 2, 3, 0
            // 0, 0, 0, 0
            int[] arr2;
            // System.out.println( arr2[0] );  // array' size is fixed, without initializing bits size we cannot use it
            String[] names = new String[5];
            names[2] = "Hasan";
            names[4] = "Parvin";
            System.out.println(Arrays.toString(names));
            int[] nums = new int[7];  // higest index: 6
            //   nums[7] =10;  // Array' size is fixed
            System.out.println(Arrays.toString(nums));
            char[] characters = {'a', 'b', 'c', 'd'};
            String str1 = Arrays.toString(characters);
            System.out.println(str1);
            int[] scores = {10, 9, 8, 7, 6, 5, 4, 3};
            Arrays.sort(scores);
            System.out.println(Arrays.toString(scores));
            String[] chars = "ABCD".split("");
            System.out.println(Arrays.toString(chars));  //{A, B, C, D
            char[] chars2 = "Vald".toCharArray();
            System.out.println(chars2);
            //  1.  Write a program that can print out the unique values from an int Array
            int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9};  // expcected result: 3
            for (int j = 0; j < numbers.length; j++) {
                int count = 0;   // find out the number of apperence
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == numbers[j]) {
                        count++;   //adds one to to occurence number of 1
                    }
                }
                if (count == 1) {   // if the value is uniue, then we print out
                    System.out.println(numbers[j]);
                }
            }
            // 2. Write a program that can print out the unique values from  String Array
            String[] array = {"A", "A", "B", "C", "C", "D", "E"};  // excepted result: BDE
            for (int j = 0; j < array.length; j++) {
                int count2 = 0;  // to store the number of apperence
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals(array[j])) {
                        count2++;
                    }
                }
                if (count2 == 1) {
                    System.out.println(array[j]);
                }
            }
            // Write a program that can find the second max number from an int array. DO NOT Use sort method
            int[] grades = {1, 2, 3, 4, 5, 6, 7, 8};  // expected result: 7
            int max = grades[0];
            for (int eachGrade : grades) {
                if (eachGrade > max) {
                    max = eachGrade;
                }
            }
            System.out.println(max);
            int secondMax = grades[0];
            for (int eachGrade : grades) {
                if (eachGrade == max) {
                    continue;
                }
                if (eachGrade > secondMax) {
                    secondMax = eachGrade;
                }
            }
            System.out.println("Second max number: " + secondMax);
            //Swap two variable' values without using a temporary variable
            int a = 10, b = 20;
            // expceted result: a=20, b= 10;
        /*
                int c = a;  // C= 10;
              a=b;   // a = 20
                b = c;          // b =c
         */
            a = a + b;  // a=30;
            b = a - b; // b = 30-20 =10
            a = a - b;  // a= 30 - 10 = 20
            System.out.println(a + " " + b);
            // Assignment: write program that can deide two numbers without / operator and remainder operator %
        }
    }







