package repl;

import java.util.Scanner;

public class Repl_97 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int counter=0;
        for(int x=0;x<=word.length()-4;x++){
            String current4Char=word.substring(x,x+4);
            if(current4Char.contains("java")){
                counter++;
            }
        }
        System.out.println(counter);



    }
}