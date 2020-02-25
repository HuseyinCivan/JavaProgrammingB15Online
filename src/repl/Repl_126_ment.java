package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_126_ment {
    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
       // String str = scan.nextLine();

//input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//output: [cat, old, ray]

        // lets jump in with this example,
        // i am gonna use this sentence
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        //what is the shortest way to split this String

       //1-to get an array from this sentence , we will use split method by " ,"

        String[] arrStr=str.split(", ");
        //ok, lets check what we have
        System.out.println("arrStr = " +Arrays.toString( arrStr));

        //secondly
     // 2- we need to find the shortest word
        //need to create a shortest word String and assume that the value is first value of the array,
        String shortestWord=arrStr[0];

        //then loop  through to check one by one,
        //we will find the first shortest word

        //lets write it
        for (int x = 0; x < arrStr.length; x++) {
           //what is our condition here?
            if(arrStr[x].length()<shortestWord.length()   ){
                //then our shortest word is
                shortestWord=arrStr[x];
                // ok?
            }

        }

        // lets see what we have now?
        System.out.println("shortestWord = " + shortestWord);

        // now we have the shortest word, but this is the first shortest word in this array ,and we do not know is there any other yet.

        // now we have old and there is two more left ,
        // how can we find them ?

        // to find the rest , i will find the length of the shortest word and then  loop in  the array to find with same length
        // so first i will create an int  variable for shortest word's length

        int shortestWordLength=shortestWord.length();
        // ok , what is the length we have?  --3
        System.out.println("shortestWordLength = " + shortestWordLength);

        // so far.
        //what we have?
        //we have an array
        //first shortest word
        // length of shortest word

        // now lets loop through  to find the other shortest word.
        //fist i ll create a string to store what we found

        String allShortestWord="";

        for (int x = 0; x <arrStr.length ; x++) {
            //ok
            //what is our if statement
            //lets write
            if(arrStr[x].length()==shortestWordLength){
                allShortestWord+=arrStr[x]+" ";

            }
        }
        //check what we have
        System.out.println("allShortestWord = " + allShortestWord);

        // now we have a string variable which stores all the shortest word
        //but we need an array to sort and print it

        // to get an array we will use split method again
        String [] arrShortestWord=allShortestWord.split(" ");
        // now we create an array
        // but before print it , we will sort it

        Arrays.sort(arrShortestWord);

        // lets print out what we have.
        System.out.println("arrShortestWord = " + Arrays.toString(arrShortestWord));
// done!


    }
}
