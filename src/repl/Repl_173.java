package repl;

import java.util.Arrays;
import java.util.Scanner;
//Given a 2d array of ints, find the biggest number(integer) and replace all array values on biggest number in the array then print an array.
//Example:
//Given values: [[1, 2, 3], [5, 33, 9]]
//output: [[33, 33, 33], [33, 33, 33]]
public class Repl_173 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
int biggestNum=arr[0][0];
        for (int x = 0; x <arr.length ; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if(arr[x][y]>biggestNum){
                    biggestNum=arr[x][y];
                }
            }

        }
        for (int x = 0; x <arr.length ; x++) {
            for (int y = 0; y < arr[x].length; y++) {

                  arr[x][y]=biggestNum;

            }

        }




        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));


    }
}
