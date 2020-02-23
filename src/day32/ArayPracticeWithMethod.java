package day32;

import java.util.Arrays;

public class ArayPracticeWithMethod {
    public static void main(String[] args) {

        //this is passing the array object directly into the method
  printArrayItems(  new int[]{1,6,5,3,12,3}  );

  //this is assigning the array object into a variable
        //and then pass it into the method
  int[] scores={2,5,8,23,4,5,6};
printArrayItems(scores);

printMaxOfIntArray(scores);
printMinOfIntArray(scores);
printSumOfIntArray(scores);
checkScoresMoreThan60(scores);

        System.out.println("__________________");

        compare2ArraySize( new String[]{ "sezgin","senay","astrit" }, new String[]{ "araz"     }   );
        System.out.println("____________________");
        String[] names1={"superman","batman","flash"};
        String[] names2={"wonder woman","cyborg","aquaman"};

compare2ArraySize(names1,names2);














//end if main
    }
    //printArrayItems
    //create a method that has one int array as a parameter
    //print out each item in this format
    //arrays has items : ----> all the items here

    public static void printArrayItems( int[] nums    ){

        System.out.println("arrays has items :"+ Arrays.toString(nums));


    }
//printMaxOfIntArray
    //this method has one int array as parameter
    //and it will print the max number inside the array

    public static void printMaxOfIntArray(int[] numbers ){
        int max=numbers[0];
        for (int x = 0; x <numbers.length ; x++) {
            if(numbers[x]>max){
                max=numbers[x];
            }

        }
        System.out.println("max = " + max);
    }

    public static void printMinOfIntArray(int[] numbers){
        int min=numbers[0];
        for (int x = 0; x <numbers.length ; x++) {
            if (numbers[x] < min) {
                min=numbers[x];
            }

        }
        System.out.println("min = " + min);
    }
    public static void printSumOfIntArray(int[] numbers){
        int sum=0;
        for (int x = 0; x <numbers.length ; x++) {
            sum=sum+numbers[x];

        }
        System.out.println("sum = " + sum);
    }
    //    // OPTIONALLY
    //    // checkScoresAllMoreThan60
    //    // this method has one int array as parameter
    //    // and it will check whether all the numbers are more than 60
    //    // if so print everyone passed
    //    // if not print someone has failed
    public static void checkScoresMoreThan60(int[] scores){
        int counter=0;
        for (int x = 0; x <scores.length ; x++) {
            if(scores[x]>60){
                counter++;
            }

        }
        if(counter==scores.length){
            System.out.println("everyone passed");
        }else{
            System.out.println("someone has failed");
        }
    }
public static void compare2ArraySize(String[] arr1,String[] arr2){
        if(arr1.length>arr2.length){
            System.out.println("array1 has more item");
        }else if(arr1.length<arr2.length){
            System.out.println("array2 has more item");

        }else{
            System.out.println("they have same item count");
        }
}




}
