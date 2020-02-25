package repl;

import java.util.Scanner;

public class Repl_100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String insideSandwich="";
        if( str.lastIndexOf("bread")- str.indexOf("bread") >5  ){

            insideSandwich= str.substring(str.indexOf("bread")+  5  , str.lastIndexOf("bread")     );
            System.out.println(insideSandwich);
        }else{
            System.out.println("nothing");
        }

    }
}
//0123456789012345678901
//xxbreadbreadjambreadyy
