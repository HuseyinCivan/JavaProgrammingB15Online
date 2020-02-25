package repl;

import java.util.Scanner;

public class Repl_69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstHalf=word.substring(0,word.length()/2);
        System.out.println(firstHalf+firstHalf);




    }
}
