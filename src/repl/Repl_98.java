package repl;

import java.util.Scanner;

public class Repl_98 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int counter=0;
        for(int x=0;x<=str.length()-2;x++){
            String current2Char=str.substring(x,x+2);

            if(current2Char.contains("hi") ){
                counter++;
            }

            System.out.println(counter);
        }
    }
}
