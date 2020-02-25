package repl;

import java.util.Scanner;

public class Repl_110 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below

        for(int x=0;x<=words.length-1;x++){
            String currentPrint=""+(words[x].charAt(0)) + (words[x].charAt(words[x].length()-1));
            System.out.println(currentPrint);
        }

    }
}