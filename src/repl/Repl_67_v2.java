package repl;

import java.util.Scanner;

public class Repl_67_v2 {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String word = scan.next();
                //WRITE YOUR CODE HERE




                if(word.length()==5){
                    for (int i = 4; i >= 0 ; --i) {

                        System.out.print(word.charAt(i));

                    }

                }else if(word.length()<5){
                    System.out.println("Too short!");
                }else{
                    System.out.println("Too long!");
                }
            }
        }
