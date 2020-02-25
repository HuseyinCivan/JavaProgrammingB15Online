package practice12_05_19;

import java.util.Scanner;

public class CharAndForLoop {
    public static void main(String[] args) {

       for(char iChar='A';iChar<='Z';iChar++){
           System.out.print(iChar+" ");
       }
        System.out.println();
        System.out.println("________________________");
      for(char iChar='A';iChar<='Z';iChar+=2){
            System.out.print(iChar+" ");
        }
        System.out.println();
        System.out.println("________________________");

        for( char kChar='Z';kChar>='A';kChar--          ){
            System.out.print(kChar+" ");

        }
        System.out.println();
        System.out.println("________________________");

        Scanner scan=new Scanner(System.in);

        System.out.println("enter two character");
        String start=scan.next();
        String end=scan.next();

        char startChar=start.charAt(0);
        char endChar=end.charAt(0);

        if(endChar>startChar){
            for(char x=startChar;x<=endChar;x++){
                System.out.print( " "+x);
            }}
            else if(startChar>endChar){
                for (char x=startChar;x>=endChar;x--){
                    System.out.print(x+" ");
                }
        }else if(startChar==endChar){
            System.out.println("Same Character");
        }








    }
}
