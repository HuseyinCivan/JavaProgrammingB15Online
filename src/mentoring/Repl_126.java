package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_126 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //splitting str String variable and creating an array
        String[] arrSplitted = str.split(", ");
        //finding the shortest word in array
        String shortestWord = arrSplitted[0];
        for(String eachStr :  arrSplitted){
            if( eachStr.length() < shortestWord.length() ){
                shortestWord = eachStr;
            }
        }
        //finding if there are another words that are evenly short as shortestWord and storing
        //them in another String called allShortWords
        String allShortWords = "";
        for( String  eachStr  : arrSplitted   ){
            if( eachStr.length() == shortestWord.length() ){
                allShortWords += eachStr+" " ;
            }
        }
        //getting an array of allShortWords String variable with split method
        String[] arrShorts = allShortWords.split(" ");
        //sorting array to have ascending order
        Arrays.sort(arrShorts);
        //print out sorted array to see what we have
        System.out.println(Arrays.toString(arrShorts) ) ;
    }
}






















