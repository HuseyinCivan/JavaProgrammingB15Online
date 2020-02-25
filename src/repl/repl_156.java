package repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_156 {
    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
        int[] new_r;
        new_r=new int[r.length+1];
        new_r[new_r.length-1]=n;
        for (int x = 0; x <new_r.length-1 ; x++) {
            new_r[x]=r[x];
        }
        System.out.println(Arrays.toString(new_r));
    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }
}