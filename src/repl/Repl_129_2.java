package repl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repl_129_2 {
    public static void main(String[] args) {
//        Given a String array arr with the following elements
//                ["zero", "one", "two","three","four"]
//
//        Create another array fewValues and copy words that have letter "e" in them
//
//        You need to know how many element contain "e" and create array accordingly
//
//        Values in fewValues array need to be["zero", "one","three"]
//
//        Examples:
//        arr -> ["aa", "be", "lol", "lel", "oreo"]
//        fewValues -> ["be",  "lel", "oreo"]
//
//        arr -> ["e", "hey", "bye", "furey", "spoon"]
//        fewValues ->["e", "hey", "bye", "furey"]

        // i need to know that which values contain "e"
        //  find the values contain "e"-
        //  i need a String which store the values

String arr[]={"zero", "one", "two","three","four"};
//int counterContainsE=0;
String containsE="";
for(int x=0;x<arr.length;x++){
    if(arr[x].contains("e")){
//counterContainsE++;
containsE=containsE+arr[x]+" ";

    }
}
        System.out.println("containsE = " + containsE);
   String[] fewValues=containsE.split(" ");
        System.out.println(Arrays.toString(fewValues));


    }
    }