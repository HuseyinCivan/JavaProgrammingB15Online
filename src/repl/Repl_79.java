package repl;

import java.util.Scanner;

public class Repl_79 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //Example:
        //input: xHiX
        //output: Hi
        //
        //Example:
        //input: apple
        //output: apple
        //
        //input: xUxL
        //output: UxL
        //
        //input: JavaX
        //output: Java

        //Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

//        if(word.substring(0,1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x")            ){
//            word=word.substring(1,word.length()-1);
//            System.out.println(word);
//        }else if( word.substring(0,1).equalsIgnoreCase("x") && !word.substring(word.length()-1).equalsIgnoreCase("x") ){
//            word=word.substring(1,word.length());
//            System.out.println(word);
//        }else if (  !word.substring(0,1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x")  ){
//            word=word.substring(0,word.length()-1);
//            System.out.println(word);
//        }else{
//            System.out.println(word);
//        }


     if (  (word.startsWith("x")||word.startsWith("X")) && (  word.endsWith("x")||word.endsWith("X")  ) ){
         System.out.println(word.substring(1,word.length()-1));
     }else if(  word.startsWith("x")||word.startsWith("X")  ){
         System.out.println(word.substring(1));
     }else if ( word.endsWith("x")||word.endsWith("X")   ){
         System.out.println(word.substring(0,word.length()-1));
     }else{
         System.out.println(word);
     }

    }
}
