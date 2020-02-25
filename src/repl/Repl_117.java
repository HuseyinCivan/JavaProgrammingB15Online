package repl;

import java.util.Scanner;

public class Repl_117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below

        for(int x=0;x<=6;x+=2){
            System.out.println(arr[x]+" , "+arr[x+1]);

        }

    }
}
