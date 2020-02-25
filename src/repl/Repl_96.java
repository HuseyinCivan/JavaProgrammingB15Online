package repl;

import java.util.Scanner;

public class Repl_96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();


        String outputMore="";
        for(int x=1; x<=count;x++){

            outputMore=outputMore+word+separator;

        }
        System.out.println(outputMore.substring(0,(outputMore.length()-separator.length() ) )) ;
    }

}

