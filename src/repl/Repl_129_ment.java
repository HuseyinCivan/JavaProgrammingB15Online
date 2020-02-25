package repl;

import java.util.Arrays;

public class Repl_129_ment {
    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }
//instructions from your teacher:
//Given a String array arr with the following elements
//["zero", "one", "two","three","four"]
//
//Create another array fewValues and copy words that have letter "e" in them
//
//You need to know how many element contain "e" and create array accordingly
//
//Values in fewValues array need to be["zero", "one","three"]
//
//Examples:
//arr -> ["aa", "be", "lol", "lel", "oreo"]
//fewValues -> ["be",  "lel", "oreo"]
//
//arr -> ["e", "hey", "bye", "furey", "spoon"]
//fewValues ->["e", "hey", "bye", "furey"]


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
//String []fewValues=new String[];
        //why it is complaining?
        // syntax needs the size of fewValues array

        //lets find the size.

        //You need to know how many element contain "e" and create array accordingly
        // create an int counter to count

        int counter=0;
     for( String eachWord    :  arr   ){
         //what is the condition ?

         if(eachWord.contains("e")){
            counter++;
         }
     }
        String []fewValues=new String[counter];

     //give value to the array
        //need a counter for index number of fewValues

        int indexNumberOfFewValues=0;

        for (int x = 0; x < arr.length ; x++) {
            if(arr[x].contains("e")){
                fewValues[indexNumberOfFewValues]=arr[x];
                indexNumberOfFewValues++;
            }

        }

        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }


}
