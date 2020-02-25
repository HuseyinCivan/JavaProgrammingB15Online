package repl;

import java.util.Scanner;

public class Repl_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int counterJava=0;
        int counterPython=0;

        for(int x=0; x<=sentence.length()-4;x++){
            String current4Char=sentence.substring(x,x+4);

            if(current4Char.equals("java") ) {
                counterJava++;
            }

        }

        for(int x=0; x<=sentence.length()-6;x++){
            String current5Char=sentence.substring(x,x+6);

            if(current5Char.equals("python") ) {
                counterPython++;
            }

        }

        System.out.println(counterPython==counterJava);
    }
}

//What's the difference between java, javascript and python?