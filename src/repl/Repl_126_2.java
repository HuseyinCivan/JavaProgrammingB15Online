package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_126_2 {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //String str = scan.nextLine();

    String str ="olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] arrStr=str.split(", ");
       // System.out.println(Arrays.toString(arrStr));


        String shortestWord=arrStr[0];


        for (String eachWord : arrStr) {
            if(eachWord.length()<shortestWord.length()){
                shortestWord=eachWord;
            }

        }
      //  System.out.println(shortestWord);

        int countNumOfShortestWord=shortestWord.length();

       // System.out.println(countNumOfShortestWord);

        //String allShortestWords="";
        int counter=0;
        for (String s : arrStr) {
            if(s.length()==shortestWord.length()){
                counter++;
            }
        }


        String[] arrAllShortestWord = new String[counter];
        int indexOfarrAllShortestWord=0;

        for (String eachWord2 : arrStr) {
            if(eachWord2.length()==countNumOfShortestWord){
                arrAllShortestWord[indexOfarrAllShortestWord]=eachWord2;
                indexOfarrAllShortestWord++;
            }

        }

//        for (String eachWord2 : arrStr) {
//            if(eachWord2.length()==countNumOfShortestWord){
//                allShortestWords=allShortestWords+eachWord2+" ";
//            }
//        }
       // System.out.println(allShortestWords);
        //String[] arrAllShortestWord=allShortestWords.split(" ");

Arrays.sort(arrAllShortestWord);
        System.out.println(Arrays.toString(arrAllShortestWord));


    }
}

