package repl;

import java.util.Scanner;

public class Repl_73 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        //01234
        //apple

        if(word.length()>=5 && word.length()%2==1){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }else{
            System.out.println("invalid");
        }


    }
}