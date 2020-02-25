package repl;

import java.util.Scanner;

public class Repl_99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int counter=0;
        for(int x=0; x<=str.length()-n;x++){

            String currentChar= str.substring(x,x+n);

            if(currentChar.equals( str.substring(0,n)) ){
                counter++;

            }
        }

        System.out.println(  counter>1   );


    }
}
