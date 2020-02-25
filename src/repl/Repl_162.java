package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int[] fibNum=new int[num];
        fibNum[0]=0;
        fibNum[1]=1;
        for(int x=2;x<num;x++){
            fibNum[x]=fibNum[x-2]+fibNum[x-1];
        }
        System.out.println(Arrays.toString(fibNum));
        System.out.println(fibNum[num-1]);
    }
}

//