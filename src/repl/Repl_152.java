package repl;

import java.util.Scanner;

public class Repl_152 {
    public static void plus_minus(int[] input) {
        int pCounter=0;
        int nCounter=0;
        int zCounter=0;
        for (int x=0;x<input.length;x++){
            if(input[x]>0){
                pCounter++;

            }else if(input[x]<0){
                nCounter++;

            }else if(input[x]==0){
                zCounter++;
            }
        }
//        positives:3, negatives:2, zeros:1
        System.out.print("positives:"+pCounter+", negatives:"+nCounter+", zeros:"+zCounter);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main



}

