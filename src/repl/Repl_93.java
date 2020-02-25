package repl;

import java.util.Scanner;

public class Repl_93 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.contains("java")   ){
            exists =word.charAt(0)=='j' || word.charAt(1)=='j';

            System.out.println(exists);

        }
        else{
            System.out.println(exists);
        }

    }
}
