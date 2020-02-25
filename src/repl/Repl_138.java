package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_138 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] arrSentence=sentence.split(" ");
        String[] assReversed=new String[arrSentence.length];

        int index=0;

        for(int x =arrSentence.length-1;x>=0;x--){
            assReversed[index]=arrSentence[x];
            index++;
        }
        reversed= Arrays.toString(assReversed).substring(1,Arrays.toString(assReversed).length()-1).replace(",","");



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}

